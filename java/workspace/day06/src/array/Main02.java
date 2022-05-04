package array;

public class Main02 {

	public static void main(String[] args) {

		/*
		 * 문제1. num1배열에 저장된 요소의 합을 구하시오.
		 */
		int[] num1  = new int[] {22, 3, 8, 12};
		int sum1 = 0;
		
		for (int i=0; i < num1.length; i++) {
			sum1 += num1[i];
		}
		System.out.println("num1 요소의 합 : " + sum1);
		System.out.println("----------------");
		
		
		/*
		 * 문제2. num2배열에 저장된 요소의 합과 평균을 구하시오.
		 */
		int[] num2  = new int[] {60, 95, 88};
		int sum2 = 0;
		float avg2;
		int len2 = num2.length;
		
		for (int i = 0; i < len2; i++) {
			sum2 += num2[i];
		}
		
		avg2 = (float) sum2/len2;
		System.out.println("num2 요소의 합: " + sum2);
		System.out.printf("num2 요소의 평균: %.2f \n", avg2);
		System.out.println("----------------");
		
		
		/*
		 * 문제3. num3배열에 저장된 요소의 최댓값을 출력하시오.
		 */
		int[] num3  = {94, 85, 95, 88, 90};	//95
		int max3 = num3[0];	//최댓값 재할당할 변수. 우선 num3의 첫번째 요소 대입해놓기
		int len3 = num3.length;
		
		for (int i = 1; i < len3; i++) {	// num3의 두번째 요소부터 마지막 요소까지 비교
			if (max3 < num3[i]) {			// max3보다 요소가 크면 그 요소를 max3에 재할당하기
				max3 = num3[i];
			}
			System.out.println(max3);
		}
		System.out.println("num3의 최댓값 : " + max3);
		System.out.println("----------------");
		
		
		/*
		 * 문제4. num4배열에 저장된 홀수와 짝수의 합을 각각 구하시오.
		 */
		
		int[] num4 = {22, 3, 8, 12};
		int sum_even = 0;
		int sum_odd = 0;
		
		for (int i = 0; i < num4.length; i++) {
			if (num4[i]%2 == 0) {
				sum_even += num4[i];
			} else {
				sum_odd += num4[i];
			}
		}
		
		System.out.println("num4의 홀수의 합: " + sum_odd);
		System.out.println("num4의 짝수의 합: " + sum_even);
		

	

			
	}

}
