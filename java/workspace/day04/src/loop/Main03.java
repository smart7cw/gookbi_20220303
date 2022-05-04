package loop;

public class Main03 {

	public static void main(String[] args) {

		// 반복문 while 연습
		// 1 ~ 10까지 누적된 합을 구해보자.
		
		int sum = 0;	// 결과값 넣을 변수
		
		int i = 1;			// 초기식
		while ( i<=10 ) {	// 조건식
			sum+=i;  		// 반복구문
			i++;			// 증감식
		}
		System.out.println(sum);
	}

}
