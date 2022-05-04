package operator;

public class Main05 {

	public static void main(String[] args) {
		
		//x1과 y1의 결과 확인
		int a1= 100;
		int x1 = 1;
		int y1 = a1 + x1++;  // 덧셈 계산한 후에 x1 1증가하여 y1은 101, x1은 2
		System.out.println("y1 : "+ y1);
		System.out.println("x1 : "+ x1);
		System.out.println("------------------");
		
		//x2과 y2의 결과 확인
		int a2= 100;
		int x2 = 1;
		int y2 = a2 + ++x2;  // x1 1증가한 후에 덧셈 계산하여 y1은 102, x1은 2
		System.out.println("y2 : "+ y2);
		System.out.println("x2 : "+ x2);
		System.out.println("------------------");
		
	
		
		//혼자 연습
		int x = 1;
		int y = 3 + 4 * (3- ++x);
		System.out.println(y);
	}

}
