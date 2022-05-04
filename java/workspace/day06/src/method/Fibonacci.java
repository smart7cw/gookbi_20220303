package method;

/*
 *  피보나치 수열
 *  피보나치 수열이란? 
 *  1,1,2,3,5,8,13,21,34,55,... 과 같이
 *  1,1로 시작해서 앞의 두항의 합이 뒤의 항으로 이루어진 수열입니다.
 *  
 *  문제 : 파라미터로 총 항의 수(n)를 받고, 입력한 총 항을 차례대로 출력하는 메소드를 만들어 보세요!
 *  
 *  예) fibonacci(10) 
 *    출력결과 ->  1 1 2 3 5 8 13 21 34 55 (한 항씩 줄바꿈으로 출력)
 *    		   
 */

public class Fibonacci {

	public static void main(String[] args) {
		fibonacci(10);
		System.out.println("---------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci2(10));
		}
	}

	public static void fibonacci(int num) {
		int start = 0;							// 1번째 수
		int next = 1;							// 2번째 수
		int next_next = 1;				// 3번째 수
		
		for (int i = 1; i <= num; i++) {
			System.out.println(next);			// 2번째 수를 계속 출력.
			
			start = next;						// 1번째 수에 2번째 수 할당
			next = next_next;					// 2번째 수에 3번째 수 할당
			next_next = start+next;				// 3번째 수에 1, 2번째 수의 합 할당
			// 1번째 수, 2번째 수, 3번째 수로 시작한 것을 2번째 수, 3번째 수, 4번째 수(1+2)번째 수로 바뀜. 이를 계속 반복.
		}
	}
	
	
	// 재귀함수 활용한 피보나치
	public static int fibonacci2(int n) {
		if (n==1 || n==2) {
			return 1;
		} else {
			return fibonacci2(n-1) + fibonacci2(n-2);
 		}
	}
	
}
