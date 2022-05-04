package value;

public class Main02 {

	public static void main(String[] args) {
		//일반변수
		int width =100;
		
		//상수
		final double PI = 3.14d;
		
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);
		
		// 값의 변경 시도,
		width = 200;
		//PI = 4.14d;  //상수는 값 변경 불가능, 에러 발생
		
		//출력 재시도
		System.out.println("width : " + width);
		System.out.println("PI : " + PI);		
		
     // /////////////////////////////////////////////////////////////////
		System.out.println("-------------------------------------");
	
		
		
		
	}

}
