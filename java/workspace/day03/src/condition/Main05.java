package condition;

public class Main05 {

	public static void main(String[] args) {

		boolean is_korean = false;
		
		if (is_korean == true){
			System.out.println("한국사람입니다.");
		}
		// 비교연산 결과 참이므로 진행한다.
		if (is_korean == false) {
			System.out.println("한국 사람이 아닙니다.");
		}
		//----------------------------------------------
		// 위의 코드 중 (조건)을 다르게 써서 간략화 할 수 있다.
		if (is_korean){
			System.out.println("한국사람입니다.");
		}
		// 거짓인 문장을 부정(!)하므로 참, 참이므로 진행한다.
		if (!is_korean) {
			System.out.println("한국 사람이 아닙니다.");
		}
	}

}
