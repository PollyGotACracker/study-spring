## 기본 타입(원시 타입;Primitive Type)

- 초깃값이 존재한다. 따라서 Null 을 사용해야 할 경우 래퍼 클래스를 이용한다.
- Stack memory 에 저장된다(실제 값).

### 래퍼 클래스(Wrapper Class)

- 래퍼 클래스는 객체이기 때문에 동등 연산자(==) 사용 시 인스턴스의 주소값을 비교하게 된다.  
  따라서 언제나 false 값을 반환한다.
- Generic type(<>) 으로 사용할 수 있다.

| 기본 타입 | 래퍼 클래스 |
| :-------: | :---------: |
|   byte    |    Byte     |
|   short   |    Short    |
|    int    |   Integer   |
|   long    |    Long     |
|   float   |    Float    |
|  double   |   Double    |
|   char    |  Character  |
|  boolean  |   Boolean   |

## 참조타입(Reference Type)

- 기본값은 Null 이다.
- Heap memory 에 저장된다(주소 값).
- Array, Enumeration, Class, Interface

## String Class

- 문자열은 원시타입처럼 사용할 수 있지만 원시타입에 속하지 않는다.
- 불변 객체이므로 값 읽기만 가능하고 변경이 불가능하다.

## Object Class

- 참조형 변수(class) 들은 기본적으로 Object class 를 상속한다.

## 3 Tier(3계층 구조)

- Client Tier: Presentation Logic : Controller class
- Application Tier : Business(Transaction) Logic : Service class
- Data Tier : Data Access Logic : Data class

## Lombok.jar plugin 설치

- 실행이 되지 않을 경우 Terminal 또는 Bash 에서

```
java -jar lombok.jar
```

- install 시 STS exe 와 같은 경로의 폴더 선택
- STS.ini 에 경로 추가 확인

```
-javaagent:C:\...\sts-bundle\sts-3.9.18.RELEASE\lombok.jar
```

- https://mvnrepository.com/artifact/org.projectlombok/lombok 의 dependency 추가
- Dto 파일에 아래 Annotation 추가 후, directory 의 Dto 파일을 확장해서 method 확인

```
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
```
