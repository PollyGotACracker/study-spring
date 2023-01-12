package com.polly.contact.exec;

/**
 * Java Source Code = 클래스 파일(Class File)
 * Java 언어로 작성된 코드는 무조건 class 키워드로 시작한다
 */

/**
 * ctrl + F11 : 실행
 * ctrl + shift + o : import
 * ctrl + spacebar : 자동완성 
 * ctrl + shift + f : 자동정렬
 */
public class ExecV1 {

	/**
	 * 독립적으로 코드를 실행할 클래스에는 
	 * 반드시 main() method 가 있어야 한다
	 * main() method 의 코드 형식은 정해져 있다
	 * 이 main() method 를 java 에서는 시작점 method 라고 한다
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println(sum);
	}
}
