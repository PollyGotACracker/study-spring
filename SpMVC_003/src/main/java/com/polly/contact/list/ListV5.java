package com.polly.contact.list;

import java.util.LinkedList;
import java.util.List;

public class ListV5 {
	public static void main(String[] args) {
		
		
		/**
		 * List type 의 객체는
		 * ArrayList, LinkedList 를 사용하여 만들 수 있다.
		 * 이 두 가지 class 는 모두 List 라는 부모 interface 를 
		 * impl 하여 작성되었다.
		 *  => class 를 바꾸어도 method 사용에 오류가 발생하지 않는다. 
		 * 
		 * 그래서 List type 의 객체를 만들 때는 
		 * 선언문은 List interface type 으로 하고
		 * 생성은 ArrayList 또는 LinkedList 로 한다.
		 */
		
		List<Integer> nums = new LinkedList<Integer>(); // new ArrayList<Integer>();
		
		/**
		 * 빈(blank) nums 의 항상 끝에 새로운 데이터 추가하기
		 * nums.add(data)
		 */
		for (int i = 0; i < 5; i++) {
			int rndNum = (int)(Math.random() * 100) + 1;
			nums.add(rndNum);
		}
		System.out.println(nums);
		
		/**
		 * add 할 위치를 지정
		 * nums.add(index, data)
		 * 
		 * 원래 5개의 list 요소 중에 3번 요소가 뒤로 밀리면서
		 * 3번 요소에 공백이 생기고
		 * 그 위치에 데이터가 추가된다.
		 */
		for (int i = 0; i < 5; i++) {
			int rndNum = (int)(Math.random() * 100) + 1;
			nums.add(3, rndNum);
		}
		System.out.println(nums);
	}
}
