package method;

/*
 * 문제3. 반환값이 있고 받는 인자값이 없는 메서드를 구현해보세요.
 */

public class Main07 {
	// main 메서드
	public static void main(String[] args) { 
		System.out.println(testString());
	}
	
	// 문자열을 반환하는 메서드 생성
	public static String testString() {
		String a = "받는 인자 없이 이 문자열을 반환합니다.";
		return a;
	}



}
