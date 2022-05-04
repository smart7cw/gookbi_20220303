package object;


// 사칙연산 기능(메서드)만 존재하는 클래스 생성
class Calc{
	//덧셈 기능을 구현
	int plus(int x, int y) {
		return x+y;
	}
	
	//뺄셈 기능을 구현
	int minus(int x, int y) {
		return x-y;
	}
		
	//곱셈 기능을 구현
	int times(int x, int y) {
		return x*y;
	}
	
	//나눗셈 기능을 구현
	float divide(int x, int y) {
		// 0으로 나누는 경우 고려 필요!!
		if (y==0) {
			return 0;
		}
		return (float)x/y;
	}
}
public class Main04 {
	public static void main(String[] args) {

		Calc c = new Calc();
		// 기능만 존재하는 객체이므로 1번만 생성하고 재사용하는 것이 바람직하다.
		int p = c.plus(10,20);
		System.out.println("덧셈 결과: " + p);
		
		int m = c.minus(1,5);
		System.out.println("뺄셈 결과: " + m);
		
		int t = c.times(2,12);
		System.out.println("곱셈 결과: " + t);
		
		float d = c.divide(5,7);
		System.out.println("나눗셈 결과: " + d);
	}

}
