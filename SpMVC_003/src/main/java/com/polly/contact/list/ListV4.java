package com.polly.contact.list;

import java.util.ArrayList;

public class ListV4 {
	public static void main(String[] args) {
		/**
		 * ArrayList 를 nums 라는 이름으로 생성하고
		 * 0 ~ 100 까지 임의 난수를 100 개 생성하여
		 * nums List 에 추가
		 */
		
		ArrayList<Integer> nums = new ArrayList();
		for (int i = 0; i < 100; i++) {
			int rndNum = (int)(Math.random() * 100) + 1;
			nums.add(rndNum);
		}
		System.out.println(nums);
		
		
		/**
		 * nums list 의 요소 중 짝수만 찾아서 출력하기
		 */
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {	
				System.out.println(nums.get(i));
				}
		}
		
		for (Integer n : nums) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		}
		// Integer 를 int 로 형변환 : UnBoxing
		// 권장하지는 않으나 정상적으로 실행된다.
		for (int n : nums) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		}
		
		/**
		 * 참고사항
		 * 다음의 두가지 변수의 type 은 엄연히 다른 type 이다.
		 */
		int intNum = 100;  // primitive 형
		Integer integerNum = 200;  // wrapper class 형
		
		// primitive type 데이터를 wrapper class type 의 변수에 저장하려고 하면
		// 내부에서 type 변환이 발생한다.
		// 이때는 int 형에 Integer 형의 기능들이 포함되면서 
		// Box 가 씌워진다. : Boxing
		integerNum = intNum;
		
		// class type 의 데이터를 기본형 type 의 변수에 
		// 저장하려고 하면 
		// 내부에서 type 변환이 발생한다.
		// 이때는 integer 형에서 사용되는 모든 기능이 해체되고
		// 단순히 숫자값만 변환된다.
		// 즉, Integer 형의 Box 가 해체된다. : UnBoxing
		intNum = integerNum;
		
	}
}
