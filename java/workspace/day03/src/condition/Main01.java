package condition;

public class Main01 {

	public static void main(String[] args) {

		int myage = 19;
		// 나이가 19살일 경우에만 출력이 되도록 조건을 걸어보자.
		
		if ( myage == 19 ) {
			System.out.println("19살 입니다.");
		}

		if ( myage != 20 ) {
			System.out.println("20살이 아닙니다.");
		}
		
		if ( myage > 19 ) {
			System.out.println("성인입니다.");
		}
		
		if ( myage <= 19 ) {
			System.out.println("학생입니다.");
		}
		
		System.out.println("실행결과");
	}

}
