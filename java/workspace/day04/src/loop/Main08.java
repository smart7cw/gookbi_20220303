package loop;

public class Main08 {

	public static void main(String[] args) {
		// for 반복문 문제
		/* 문제1. 1~50까지 숫자의 합
		 */
		int sum = 0;
		for (int i = 0; i<=50; i++) {
			sum += i;
		}
		System.out.println("1 + 2 + ... + 50 = " + sum);
		
		//문제1 while형태
		sum = 0;
		int t = 1;
		while (t<=50) {
			sum += t;
			t++;
		}
		System.out.println("1 + 2 + ... + 50 = " + sum);
		System.out.println("----------------------------------");
		
		/* 문제2.구구단 2단 식 형태로 출력하기 
		 */
		int result;
		for (int i = 1; i <= 9; i++) {
			result = 2*i;
			System.out.println("2 x " + i + " = " + result);	
		}
		System.out.println("----------------------------------");

		//문제2 while형태
		int p = 1;
		while (p<10) {
			System.out.println("2 x " + p + " = " + 2*p);	
			p++;
		}
		System.out.println("----------------------------------");
		
		// while 반복문 문제
		/* 문제1. 10 번 찍어 안 넘어가는 나무 없다.
		 * 나무를 1번 찍었습니다. ... 10번 찍었습니다.
		 * 나무 넘어갑니다.
		 * 출력하기
		 */
		int tree_hit = 0;
		System.out.println("10번 찍어 안 넘어가는 나무 없다.");
		while (tree_hit<10) {
			tree_hit++;
			System.out.println("나무를 " + tree_hit + "번 찍었습니다.");
			
			if (tree_hit==10) {
				System.out.println("나무 넘어갑니다.");
			}

		}
		System.out.println("----------------------------------");

		//문제1 for형태
		System.out.println("10번 찍어 안 넘어가는 나무 없다.");
		for (int i = 1; i<=10; i++) {
			System.out.println("나무를 " + i + "번 찍었습니다.");
		}
		System.out.println("나무 넘어갑니다.");
		System.out.println("----------------------------------");

	}

}
