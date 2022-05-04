package amtest;

public class Scenario {

	public static void main(String[] args) {
		//김찬우 - 네트워크 프로그래밍 구현 - 문제해결 시나리오 답변
		//문제1. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if ( i%2==0 || i%3==0 ) {
				continue;
			}
			sum += i;
		}
		System.out.println("문제1 결과: " + sum);
		
		
		//문제2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.
		int sum2 = 0;
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=i; j++) {
				sum2 += j;
			}
		}
		System.out.println("문제2 결과: " + sum2);
		
	}

}
