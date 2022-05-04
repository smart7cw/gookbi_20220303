package test0330;

/*
[데이터베이스 구현 문제 답변 - 김찬우8970]
1. Calc 클래스를 생성 한다.(10점)
2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.(10점)
3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.(5점)
4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.(5점)
5.int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.(5점)
6.int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다. (5점)
7.main 메서드를 포함하는 클래스를 생성 한다.(10점)
8.2개의 정수를 입력 받는다.(10점)
9.입력 받은 정수를 각각 출력 한다.(10점)
10.main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.(5점)
11.main 메서드에서 본인의 이름을 출력한다.(5점)
12.Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
13.Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
 */


class Calc {				//1. Calc클래스 생성
	
	private String name;	//2. 전역변수 name에 대한 getter setter 생성
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	
	Calc(String name_input) {setName(name_input);}		//2. 파라미터 있는 생성자 생성  & 10. 객체 생성시 이름을 받아 전역변수 name에 할당하도록 함
	
	public int plus(int x, int y) {	return x+y; }	//3. plus메서드 생성
	public int minus(int x, int y) { return x-y; }	//4. minus메서드 생성
	public int times(int x, int y) { return x*y; }  //5. times메서드 생성
	public int divide(int x, int y) {				//6. divide메서드 생성 (0나눔 고려)
		if (y==0) { return 0; }
		return x/y;
	}
}

public class Class_1 {					//7. main메서드 포함하는 클래스 생성
	public static void main(String[] args) {
		
		int num1 = 20;							//8. 2개의 정수 선언
		int num2 = 10;
		System.out.println("정수1 : " + num1);	//9. 2개의 정수 출력
		System.out.println("정수2 : " + num2);
		System.out.println("------------");
		
		Calc c = new Calc("김찬우");						//10. 객체 생성. 이름을 매개변수로 받게 함->전역변수 name에 할당
		System.out.println("내 이름: " + c.getName()); 	//11. 할당된 이름을 getName으로 접근해 출력
		System.out.println("------------");
		
		System.out.println("덧셈 결과: " + c.plus(num1,num2));		//12. 덧셈, 뺄셈 결과 출력
		System.out.println("뺄셈 결과: " + c.minus(num1,num2));
		System.out.println("곱셈 결과: " + c.times(num1,num2));	//13. 곱셈, 나눗셈 결과 출력
		System.out.println("나눗셈 결과: " + c.divide(num1,num2));
		
	}

}
