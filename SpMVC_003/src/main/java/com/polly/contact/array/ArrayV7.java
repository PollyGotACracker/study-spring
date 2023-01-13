package com.polly.contact.array;

public class ArrayV7 {
	public static void main(String[] args) {
		/**
		 * 정수형 배열 45개를 만들고
		 * index 0 ~ 44 까지 요소에 1 ~ 45 까지 정수를 저장
		 */
		
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();
		/**
		 * 배열 45개의 요소를 Shuffle 하고 결과 출력
		 */
		
		for(int i = 0; i < nums.length; i++) {
			int rndNum1 = (int)(Math.random() * nums.length);
			int rndNum2 = (int)(Math.random() * nums.length);
			
			// index 가 같을 경우 XOR swap 시 0 이 나타나게 됨
			if (rndNum1 != rndNum2) {
				nums[rndNum1] = nums[rndNum1] + nums[rndNum2];
				nums[rndNum2] = nums[rndNum1] - nums[rndNum2];
				nums[rndNum1] = nums[rndNum1] - nums[rndNum2];
			}
		}
		
		for(int i : nums) {
			System.out.printf("%d\t", i);
		}
		
		System.out.println();
		
		int[] lottos = new int[6];
		// nums 배열의 0 부터 5까지 요소를
		// lottos 0부터 5까지 요소에 각각 복사
		
		for (int i = 0; i < 6; i++) {
			lottos[i] = nums[i];
		}
		
		System.out.println();	
	
		for (int n : lottos) {
			System.out.printf("%d\t", n);
		}
		
		for (int i = 0; i < lottos.length; i++) {
			for (int j = i + 1; j < lottos.length; j++) {
				if (lottos[i] > lottos[j]) {
					lottos[i] = lottos[i] + lottos[j];
					lottos[j] = lottos[i] - lottos[j];
					lottos[i] = lottos[i] - lottos[j];
				}
			}
		}
		
		System.out.println();	
		
		for (int num : lottos) {
			System.out.printf("lottos: %d\t", num);
		}
		
		System.out.println();
		
		int[] array = new int[5];
		array[0] = 30;
		array[1] = 55;
		array[2] = 45;
		array[3] = 70;
		array[4] = 10;
		
		for (int i = 0; i < array.length; i++) {
			// cf)
			// if 문의 조건을 ele[i] > ele[j] 로 주었는데도,
			// 내부 반복문의 초기화식이 j = 0 이면 내림차순 정렬되는 이유..
			// 		i 가 0 ~ 4 까지 값이 증가할수록(index 값이 커질수록 = n회전 할수록), 
			// 		index 에 대응하는 값은 이전보다 큰 수가 될 것이라 예상할 수 있다.
			// 		반면 j 의 0 ~ (i - 1) index 까지 대응하는 값은 
			// 		이미 정렬되어 작은 수이다.
			// 따라서 j 가 i 보다 작을 때, ele[i] > ele[j] 로 비교하게 되면 참이 되어 
			// 이미 오름차순 된 값이 다시 뒤바뀌게 된다.
			// 이미 정렬된 기준값은 자리가 고정되어야 한다.
			// 따라서 오름차순 정렬 시 내부 index 는 외부 index 값 + 1 로 준다.
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];				
					}
			}
		}
		for (int num : array) {
			System.out.printf("array: %d\t", num);
		}
				
	}
}
