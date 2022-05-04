package method;

/*
 * 문제1. "Hello, World~", "메서드가 호출되었습니다."를 출력하는 메서드를 각각 만들어 호출하세요.
 */

public class Main05 {
	// main 메서드
	public static void main(String[] args) {
		f1();
		f2();	
	}
	
	// 문장1을 출력하는 메서드 생성
	public static void f1() {
		System.out.println("Hello, World~");
	}
	
	// 문장2를 출력하는 메서드 생성
	public static void f2() {
		System.out.println("메서드가 호출되었습니다.");
	}



}
