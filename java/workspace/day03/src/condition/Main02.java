package condition;

public class Main02 {

	public static void main(String[] args) {

		int point = 85;
		/*
		 * point가 70보다 크고 80 이하이면 "C학점 입니다." 를 출력,
		 * point가 70 이하 또는 80보다 크면 "범위를 벗어났습니다."를 출력해보자.
		 */
		
		// AND(&&) 사용
		if ( point>70 && point<=80) {
			System.out.println("C학점 입니다.");
		}
		
		// OR(||) 사용
		if ( point<=70 || point>80 ) {
			System.out.println("범위를 벗어났습니다.");
		}
	}

}
