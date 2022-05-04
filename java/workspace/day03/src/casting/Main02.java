package casting;

public class Main02 {

	public static void main(String[] args) {
		
		long l = 100L;
		// int i = l;		// 에러 발생
		int i = (int) l;	// 명시적 형변환 성공
		short s = (short)i;	// 괄호랑 변수랑 붙여도 됨
		
		System.out.println("long: " + l);
		System.out.println("long to int: " + i);
		System.out.println("long to short: " + s);
		System.out.println("-----------------");
		
		double pi1 = 3.14D;
		// 큰 범위의 변수를 작은 범위의 변수에 대입 시 에러가 발생한다.
		// int pi2 = pi1;
		int pi2 = (int)pi1;		// 명시적 형변환 성공
		
		System.out.println("double: " + pi1);			// 3.14
		System.out.println("double to int: " + pi2);	// 3
		System.out.println("-----------------");


		
		
	}

}
