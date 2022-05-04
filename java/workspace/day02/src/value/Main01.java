package value;

public class Main01 {

	public static void main(String[] args) {
		//변수의 선언
		int num1;  //num1이 선언만 되고 사용하는 곳이 없으므로 노란색 줄 "경고"로 표시됨
		//변수의 할당
		num1 = 100;
		
		//System.out.println(num1);  // num1에 커서 대고 있으면 변수를 할당하라initialize variable이라고 뜸
		System.out.println(num1);
	
		//변수의 재할당
		num1 = 200;  //main메서드는 위에서부터 아래로 차례대로 읽으므로 100으로 출력된 다음에 200으로 재할당된다.

		System.out.print(num1);  //print는 println과는 달리 끝에 엔터가 추가되지 않아있으므로 뒷 출력값와 이어서 나타난다
		System.out.println(num1);  //재할당 후 읽히므로 200이 출력된다
		
		System.out.println("num1: " + num1);  //코드가 길어지면 어느 변수가 어떤 값인지 헷갈리므로 이렇게 명시해주면 좋다

// /////////////////////////////////////////////////////////////////
		System.out.println("-------------------------------------");
		
		// 선언, 할당, 접미사의 사용
		long num3 = 1223000000000000000L;
		double num4 = 128.d;
		float num5 = 3.14f;
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);

	// /////////////////////////////////////////////////////////////////
		System.out.println("-------------------------------------");
	
		byte t = 100;
		short s = 250;
		char c = '가';
		boolean b = true;
		
		System.out.println("t : " + t);
		System.out.println("s : " + s);
		System.out.println("c : " + c);
		System.out.println("b : " + b);
				
				
				
	}

}
