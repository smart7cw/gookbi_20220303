package loop;

public class Main04 {

	public static void main(String[] args) {

		// 반복문 while 연습
		// 구구단 7단의 결과값
		
		int result;	// 결과값 넣을 변수
		
		int i = 1;			// 초기식
		while ( i<10 ) {	// 조건식
			result=7*i;  		// 반복구문
			System.out.println("7 x " + i + " = " + result);
			i++;			// 증감식
		}
	}
	
}
