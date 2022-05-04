package loop;

public class Main05 {

	public static void main(String[] args) {

		// 반복문 do~while 연습
		// 1 ~ 100 누적된 합
		
		int sum = 0;	// 결과값 넣을 변수
		
		int i = 1;
		do {
			sum +=i;
			i++;
		} while (i<=100);
		
		System.out.println(sum);

	}
}
