package com.polly.contact.array;
/**
 * Java 배열(Array)
 * 1. 단일 type의 데이터만 저장할 수 있다.
 * 2. 크기를 초기에 정하고 크기를 변경할 수 없다.
 * 3. 배열은 처음에 개수를 정하여 선언하고, 초기화를 해야한다.
 */
public class ArrayV1 {
	
	// main() 시작점 method
	public static void main(String[] args) {
		int num1 = 0;
		
		// Java 에서 문자열은 변수이면서, 객체이다.
		String str1 = "";
		String str2 = new String();
		
		// 정수형 데이터 10개를 저장할 배열 nums1 을 만든다.
		// 대괄호 안의 숫자는 Array 의 길이로 변경이 불가능하다.
		int[] nums1 = new int[10];
		// 실수형(float) 데이터 10개를 저장할 배열 nums2 를 만든다.
		float[] nums2 = new float[10];
		
		// num1 배열에 정수형 데이터(값)를 저장한다.
		// 대괄호 안의 숫자는 Array 내 요소의 index 이다.
		nums1[0] = 100;
		nums1[1] = 200;
		
		// nums1 배열의 요소 중 일부 데이터 읽기
		int sum = nums1[0] + nums1[1];
		
		/**
		 * Java 는 초기에 배열 길이가 정해지면 변경할 수 없다.
		 * 만약 nums1 에 길이가 20인 새로운 배열을 생성하는 명령이 수행되면
		 * 기존에 nums1 의 배열은 garbage collecting, 길이가 20인 새로운 배열이 생성
		 * 변수 num1 는 새롭게 생성된 배열을 가리킨다.
		 */
		nums1 = new int[20];
		nums1[0] = 200;
		
		// nums1 배열은 20개의 요소(item)을 가지고 있다.
		// 따라서 20 index 의 요소에 값을 저장하려고 하면
		// ArrayIndexOutOfBound exception 이 발생한다.
		nums1[20] = 100;
		
		// 읽기도 마찬가지로 index exception 이 발생한다.
		System.out.println(nums1[20]);
		
		/**
		 * 배열의 index 최대값은 항상 전체 크기(length)의 -1 까지다.
		 */
		
	}
}
