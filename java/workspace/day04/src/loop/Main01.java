package loop;

public class Main01 {

	public static void main(String[] args) {

		// 반복문 for 연습
		//1 ~ 5 까지의  합 15를 계산해보자.
		int sum = 0;
		
		// i가 1부터 5까지 증가하는 동안,
		// i의 값을 sum에 누적한다.
		// i는 6에 도달해서야 조건을 F로 만든다.
		for (int i = 0; i<=5; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
