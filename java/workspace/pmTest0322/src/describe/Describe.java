package describe;

public class Describe {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
            }
            System.out.println();
		}
		System.out.println();
		//문제1. 다음의 for 문을 while 문으로 변경하시오.
		int i = 0;
		int j = 0;
		while ( i<=10 ) {
			j = 0;
			while ( j<=i ) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("--------------");
		//문제2. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		for (int i2 = 1; i2<=6; i2++) {
			for (int j2 = 1; j2 <=6; j2++) {
				if ( i2 + j2 == 6) {
					System.out.println(i2 + "+" + j2 + "=6");
				}
			}
		}
		
		System.out.println("--------------");
		//문제3. 방정식 2x+4y=10  의 모든 해를 구하시오.  단 x 와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		for (int x = 0; x<=10; x++) {
			for (int y = 0; y <=10; y++) {
				if ( 2*x + 4*y == 10) {
					System.out.println("x=" + x + ", y=" + y);
				}
			}
		}
	

	}

}
