package com.polly.contact.array;

public class ArrayV2 {
	public static void main(String[] args) {
		int[] nums1 = new int[10];
		// nums1 0번째 요소의 기억장소 주소값을 16진수로 표시한다.
		System.out.println(nums1);
		
		// num2 변수에는 실제 배열 데이터가 저장된 기억공간의 
		// 첫번째 주소(index 0번)가 저장되어 있다.
		// println() 시 배열의 첫번째 요소 주소 반환
		int[] nums2 = new int[20];
		System.out.println(nums2);
		
		/**
		 * 배열.length(length 속성) : 배열의 개수, 길이를 알려주는 속성
		 */
		System.out.println(nums1.length);  // 10
		
		/**
		 * nums1 이라는 배열 전체의 모든 요소에
		 * 정수 10 을 저장
		 */
		 for(int index = 0; index < 10; index++) {
			 nums1[index] = 10;
		 }
		 // 배열의 개수를 일일이 확인하지 않아도
		 // 전체 배열에 정수 10을 저장할 수 있다.
		 for(int index = 0; index < nums1.length; index++) {
			 nums1[index] = 10;
		 }
		 /**
		  * 어떤 코드를 사용할 때 일반적인 숫자 표현식(숫자 리터럴)을
		  * 사용하는 것은 지양해야 한다.
		  * 일반적인 숫자를 사용하면 항상 변화되는 숫자를
		  * 개발자가 알고 있어야 하고, 숫자를 잘못 지정하여
		  * 오류가 발생할 확률이 높아진다.
		  * 숫자값을 직접 사용하지 않아도 어떤 속성을 참조하여
		  * 알 수 있다면 그러한 방법을 사용해야 한다.
		  * 
		  * 매직 넘버링 : 숫자를 직접 사용하는 것
		  * 코딩을 할 때 매직 넘버링은 잠재적 오류를 발생시킬 확률이 매우 높은 방법이다.
		  * 가능하면 사용하지 말 것
		  * 
		  */
		 
	}
}
