package com.polly.contact.list;

import java.util.ArrayList;

public class ListV2 {
	
	public static void main(String[] args) {
		/**
		 * Integer type 의 요소 10개를 담는 List num1 을 생성하고
		 * 각 요소의 값을 똑같이 10으로 채운다.
		 */
		
		// 1. 빈(Blank) List nums1 을 생성하고
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		// 2. for() 반복문을 10번 반복하면서
		// 3. nums1 List 에 정수 10을 add 한다.
		for(int i = 0; i < 10; i++) {
			nums1.add(10);
		}
		/**
		 * Java 에서 생성한 모든 object
		 * 		(object 는 클래스를 사용하여 생성한 변수)
		 * 모두 .toString() method 를 가지고 있다.
		 * System.out.print(object) 형식의 코드가 실행되면
		 * print() 는 내부에서 object.toString() method 를 실행하고
		 * 거기에서 나오는 "문자열" console 에 출력한다.  
		 */
		// 따라서 아래 두 코드는 같은 결과를 출력한다.
		System.out.println(nums1.toString());
		System.out.println(nums1);
	}
}
