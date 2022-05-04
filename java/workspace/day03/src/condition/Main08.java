package condition;

public class Main08 {

	public static void main(String[] args) {
		/*
		 * char형 grade 선언하기. grade에는 A,B,C,가 있다.
		 * A,B,C, : "Pass" 1번 출력
		 * 그 외 다른 등급일 경우 : "Not-Pass" 1번 출력
		 */
		
		char grade = 'B';
		
		//if 사용한 답
		if ( grade=='A' || grade=='B' || grade=='C' ) {
			System.out.println("Pass");
		} else {
			System.out.println("Not-Pass");
		}
		
		//switch 사용한 답
		switch ( grade ) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		default:
			System.out.println("Not-Pass");
			break;
		}
	}

}
