package loop;

public class Main07 {

	public static void main(String[] args) {

		int max = 100;
		 
		// 조건문이 먼저 읽혀 반복구문이 실행되지 않고 종료된다.
		while ( max > 100 ) {
			System.out.println("while문");
		}
		
		// 반복구문이 먼저 읽혀 구문이 1번 실행된 뒤 조건문에 의해 종료된다.
		do {
			System.out.println("do~while문");
		} while ( max > 100);
		

	}
}
