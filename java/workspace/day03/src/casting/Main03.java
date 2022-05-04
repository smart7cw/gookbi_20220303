package casting;

public class Main03 {

	public static void main(String[] args) {

		double a = 10.5d;
		float b = 20.5f;
		
		//변수의 연산 시 작은 범위의 변수가 "암묵적"으로 큰 범위의 데이터형으로 변환된다.
		// float f = a + b;		// 에러 발생
		double d = a + b;		// 결과는 31.0d
		float f = (float) a+b;	// 결과는 31.0f
		
		System.out.println(d);
		System.out.println(f);
		
	}

}
