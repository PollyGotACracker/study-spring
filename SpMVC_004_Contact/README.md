# Simple WAS Project

## simple maven project 생성
* STS 에서 File -> new -> other... -> maven project 를 선택하여 project 생성
* `Create a simple project` 를 체크하고 프로젝트 생성 진
* `Group id`, `Artifact id` 를 설정: project 의 base-package 를 설정하는 부분

```
Group id: com.polly
Artifact id: contact
```

* artifact id 는 project 의 context 이름이 된다.

## pom.xml 에 plugin 설정

* maven builder 를 사용할 때 어떤 컴파일러 도구를 사용할 것인지를 설정하는 부분

```xml
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>15</source>
					<target>15</target>
					<compileArgument>-Xlint:all</compileArgument>
					<showWarnings></showWarnings>
					<showDeprecation></showDeprecation>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

## pom.xml 에 spring framework 설정

* spring framework dependencies 가져오기
* dependency 의 version 정보를 properties 로 설정하기 위하여 아래와 같이 코드 변경

```xml
<version>${org.springframework-version}</version>
```

```xml
	<dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
	</dependencies>
```

* spring framework version properties 설정하기

```xml
	<properties>
	<org.springframework-version>5.2.22.RELEASE</org.springframework-version>
	</properties>
```

## JSON 데이터 Response 하기
* `Ajax(Async Javascript And XML)`: 비동기적 자바스크립트와 XML 의 연동
* VanilaJS 에서는 `XMLHttpRequest` 통신 이라고 한다.
* fetch 와 같은 JS 함수가 제공되지 않을 때는 XMLHttpRequest 를 사용하여 XML 데이터를 주고받는 Api 코드를 작성했다.
* 초기 API 코드에서는 모든 데이터 type 이 XML 이었다.
* 이후 JS 가 발전하면서 JSON type 의 데이터가 점점 많아지고 지금은 거의 표준화 되었다.
* Java 를 사용하는 Web Application 에서는 초기에 XML 만을 제공하다가 어느 순간 필요를 느끼고 JSON 을 추가하게 된다.
* 실질적으로 Java 고유의 기능에서는 JSON 지원이 없다.
* Java 사용자들로부터 JSON 에 대한 요구가 많아지면서 JSON 데이터를 취급하기 위한 여러 Java 의 lib 들이 나타났다. 현재는 몇 가지 정도로 축소되었다.

* SpringMVC 에서 Client 에게 JSON(또는 XML) type 의 데이터를 API 형식으로 Response 하기 위해서 `jackson` lib 가 탄생되고, 지금 Response 에서는 거의 `jackson-databind` 가 사용된다.

* 초기에서는 `jackson-databind` 에서 XML 을 기본으로 하였으나, 시간이 지나면서 XML 기능을 별도로 분리했다.
* XML 기능이 필요한 경우, `jackson-dataformat-xml` 을 추가하면 XML Response 를 구현할 수 있다.

* 여기서 약간의 문제가 발생하는데, `data-bind` 와 `dataformat-xml` 을 같이 설치하게 되면 Spring 은 객체 등을 Response 할 때 XML type 으로 보낸다. 

* JSON 으로 Response 할지, XML 로 Response 할지를 선택하여 보낼 수 있다.

```java
// JSON 으로 Response
produces="application/json;charset=UTF-8"
// XML 으로 Response
produces="application/xml;charset=UTF-8"
```

## Java(Spring) 에서 인스턴스 변수의 취급
* 인스턴스 변수는 클래스 영역(멤버 영역)에 선언된 변수
* 이 변수는 클래스를 사용하여 객체로 생성할 때 초기화 된다.
* 객체가 작동되는 동안에 이 변수도 항상 살아있다.
* 변수가 살아있다는 것은 그만큼 메모리 공간을 차지하고 있다는 것이다. 이것을 리소스 소비 라고 한다.
* 전혀 사용하지 않는 변수도 객체와 함께 계속 리소스를 소비하고 있다는 것이다.
* 인스턴스 변수는 특별한 경우가 아니면 `public` 으로 선언하지 않는다.
* 또한 접근제한자(public, private, protected 등)가 없는 상태로 선언하지 않아야 한다.
* 접근제한자가 없으면 Java 엔진에서 알아서 접근제한자를 붙이는데, 조금 특별하게 변수에 접근하게 된다.
* 변수에 접근제한자를 붙이지 않거나, public 으로 선언하면 메모리 누수 발생(불필요한 메모리 낭비)이 생길 수 있다.
* spring 처럼 다중 사용자에게 서비스 하는 경우 객체가 다수 생성이 될 수 있는데, 이때 인스턴스 변수도 객체 개수만큼 무리지어 생성된다.
* 이러한 과정에서 많은 메모리 누수가 발생하고 서버가 다운되는 일도 발생할 수 있다.
*
### `인스턴스 변수` 규칙
1. 인스턴스 변수는 특별한 경우가 아니면 `private` 또는 `protected` 로 제한한다.
2. 인스턴스 변수는 직접 초기화하지 않는다.
```java
	private Random rnd = new Random();
```
3. 인스턴스 변수는 '선언'과 '초기화'를 분리해야 한다.
```java
	public class MyClass {
		private String myname; // 선언만

		// 생성자에서 변수 초기화
		public MyClass() {
			this.myname = myname;
		}
		public MyClass(String myname) {
			this.myname = myname;
		}
	}
``` 