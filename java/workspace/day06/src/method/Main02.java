package method;

public class Main02 {
	// main 이라는 메서드 존재함
	public static void main(String[] args) {
		
		//f1();			// 파라미터 존재하지 않아 오류 발생
		f1(100);		// 110 출력
		f1(200);		// 210 출력
		//f1(100.0);	// 정수가 아닌 값이라서 오류 발생
		
		plus(5,1);
		minus(5,1);
	}
	
	// f1 이라는 새 메서드 생성하기
	public static void f1( int a) {
		int b = 10;
		System.out.println(a + b);
	}
	
	public static void plus( int a, int b) {
		System.out.println(a + b);
	}
	
	public static void minus( float a, int b) {
		System.out.println( a - b );
	}

}
