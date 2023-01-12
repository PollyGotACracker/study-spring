package com.polly.contact.list;

import java.util.ArrayList;

public class ListV3 {
	public static void main(String[] args) {
		/**
		 * Generic type : <> 로 둘러싸인 type
		 * List<Generictype> : 
		 * 		List 객체에 add 할 수 있는
		 * 		data type 을 강제 지정하기
		 * 
		 * Generic type 이외의 데이터를 add() 하면
		 * 코드에 오류가 표현된다.
		 * 
		 * 개발자로 하여금 잘못된 데이터를 add() 하여
		 * 이후에 발생할 수 있는 문제를
		 * 사전에 방지할 수 있도록 알려준다.
		 * 
		 * Generic type 에는 클래스 type 만 사용할 수 있다.
		 * primitive type 은 사용할 수 없다 : int, long, float, double, boolean, char, byte
		 */
		
		// ArrayList<int> nums = new ArrayList<int>(); 
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		// 아래와 같은 경우는 오류 발생... Double 로 지정해야 한다.
		// nums1.add(30.0);
		
		/**
		 * keyword, 예약어(resolved word)
		 * Java 언어에서 미리 만들어진 명령어들
		 * 이러한 단어는 절대 변수명, 함수명, 클래스명 등으로 사용할 수 없다.
		 * 또한 용도를 변경할 수도 없다.
		 */
		
		/**
		 *  정수형 Generic type 을 갖는 List 를 하나 만들고 싶다.
		 *  그런데 Generic type 에는 primitive keyword 를 사용할 수 없다.
		 *  그러면 어떻게 정수형 Generic type 을 갖는 List 를 만들어야 할까?
		 *  
		 *  이러한 이유로 변수를 선언하는 class 를 제공해준다.
		 *  
		 *  Wrapper Class
		 *  primitive(기본;원시) keyword 와 같거나 유사하며 첫글자가 대문자이다.
		 *  기본 변수 선언 키워드와 거의 유사한 성질을 가지며 추가된 확장 기능을 포함한 클래스이다. 
		 */
		
		int num1 = 0;
		Integer num11 = 0;
		
		long num2 = 0l;
		Long num22 = 0l;
		
		float num3 = 0.0f;
		Float num33 = 0.0f;
		
		double num4 = 0.0;
		Double num44 = 0.0;
		
		boolean bYes1 = true;
		Boolean bYes11 = true;
			
	}
}
