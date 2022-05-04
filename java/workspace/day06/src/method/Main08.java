package method;

/*
 * 문제3. 반환값이 있고 받는 인자값이 없는 메서드를 구현해보세요.
 */

public class Main08 {
	// main 메서드
	public static void main(String[] args) { 
		
		String test_result = testTen(10.00001);
		System.out.println(test_result);
		
				
	}
	
	// 조건에 따른 결과를 문자열로 반환하는 메서드 생성
	public static String testTen(double d) {
		if (d > 10) {
			return "이 수는 10보다 큰 수입니다.";
		} else if (d == 10) {
			return "이 수는 10입니다.";
		} else {
			return "이 수는 10보다 작거나 같은 수입니다.";
		}
	}



}
