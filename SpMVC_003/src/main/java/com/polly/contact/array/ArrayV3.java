package com.polly.contact.array;

public class ArrayV3 {
	// final = const
	// 불변 변수, 값이 한번 지정되면 변경할 수 없는 변수 : 상수
	private final static int ARRAY_LENGTH = 10;
	private final static int PLUS_NUM = 10;
	public static void main(String[] args) {
		int[] nums1 = new int[ARRAY_LENGTH];
		for(int index = 0; index < ARRAY_LENGTH; index++) {
			nums1[index] = index + PLUS_NUM;
		}
		/**
		 * 값을 저장하기 위한 for() 를 한번 사용하고
		 * 각 요소의 합산을 하기 위한 for() 를 또 한 번 사용했다.
		 * 그 이유는 "각각 할 일을 분리하기 위함"
		 * 단일 책임의 원칙 : 한 가지 일에만 집중하라
		 * 		객체 지향의 원칙 중 하나이지만
		 * 		코딩할 때 모든 분야(모듈, 블럭) 등에서
		 * 		주요하게 생각해볼 부분이다.
		 * 한가지 모듈에서 여러가지 일을 수행하게 되면
		 * 모듈의 크기가 비대해지고, 유지보수가 그만큼 어려워진다. 
		 */
		int sum = 0;
		for (int index = 0; index < nums1.length; index++) {
			sum += nums1[index];
		}
		System.out.printf("합계 : %d", sum);
	}
}
