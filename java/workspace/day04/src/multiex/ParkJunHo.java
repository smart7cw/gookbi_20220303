package multiex;

public class ParkJunHo {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		System.out.println("문제1)");
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		System.out.println("문제2)");
		int sum2=0;
		for (int i = 1; i <= 10; i++) {
			++i;
			sum2+=i;
		}
		System.out.println(sum2);
		
		/*
		 * 문제 3. 
		  	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		System.out.println("문제3)");
		for (int i=0;i<=8;i++) {
			System.out.println("★★★★★★★★");
		}
		
		/*
		 * 문제 4. 
			★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		System.out.println("문제4)");
		for(int i=0;i<=8;i++) {
			for(int j=8;j>=i;j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		/*
		 * 문제 5. 
			★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		System.out.println("문제5)");
		for(int i=0;i<=8;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능) 2중 for문, 2중 while문
		 */
		System.out.println("문제6)");
		for(int i=1; i<10; i++) {
			for(int j=1;j<10;j++) {
				System.out.print("	|" + j + "*" + i + " = " + i*j + "|");
			}
			System.out.println();
		}
	}
}
