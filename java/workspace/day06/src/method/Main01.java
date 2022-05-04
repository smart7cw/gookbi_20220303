package method;

public class Main01 {
	// main 이라는 메서드 존재함
	public static void main(String[] args) {
		
		//main메서드 밖에 f메서드 생성한 뒤에 그냥 실행하면, main메서드만 실행되어 아무것도 출력되지 않는다.
		//f는 단순 정의되어 있는 상태이지 실행되지 않는다.
		
		//아래처럼 f를 "호출"하면 f가 실행된다.
		f();
		
		// 메서드는 여러번 호출도 가능하다.
		f();
		f();
		f();
		f();
		
	}
	
	// f 라는 새 메서드 생성하기
	public static void f() {
		int x = 100;			//x에 100할당하고 y에 x+1할당하고 y를 출력한다.
		int y = x + 1;
		System.out.println(y);
	}

}
