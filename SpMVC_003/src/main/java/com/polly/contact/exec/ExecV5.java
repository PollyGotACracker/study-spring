package com.polly.contact.exec;

public class ExecV5 {
	
	/**
	 * 한 모듈(file, class) 단위에서
	 * 같은 이름의 변수, 같은 이름의 함수(또는 method)는
	 * 중복하여 만들 수 없다(중복 선언 금지).
	 * 
	 * java 는 완전한 객체지향 표준어이다.
	 * 객체지향의 특징으로
	 * 		method 의 매개변수 상태에 따라
	 * 		method 의 이름을 중복하여 선언할 수 있다.
	 * 이것을 Overloading(method 의 중복 선언) 이라고 한다.
	 * 
	 * 중복선언된 method 는 호출하는 곳에서
	 * 주입한 값의 상태에 따라 자동으로 알아서 
	 * 정확한 method 가 호출된다.
	 * 
	 * method 영역(block)이 다르면
	 * 같은 이름의 변수를 또 선언하여 사용할 수 있다.
	 * 
	 * cf)
	 * 메소드 오버로딩(Overloading)
	 * 객체지향 언어에서는 같은 함수명일지라도 
	 * 매개변수의 개수나 타입이 다르면 중복 선언할 수 있다.
	 */
	public static void num(int num1) {}
	public static void num(int num1, int num2) {}
	public static void num(float num1) {}
	public static void num(double num1) {}
	
	public static void main(String[] args) {
		num(100);
		num(100,200);
		num(100f);
		num(100.0);
		
		int num = 100;
		num = 0;
		// num1 변수는 이미 한번 선언되었기 때문에 다시 선언할 수 없다.
		// int num = 100;
		
	}
}
