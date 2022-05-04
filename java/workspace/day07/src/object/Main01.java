package object;

// 새 클래스 생성
class Student{
	// 이름, 나이를 멤버변수로 생성
	String name = "자바학생";
	int age = 19;
	
}

public class Main01 {

	public static void main(String[] args) {

		// Student클래스에 대한 객체 std의 선언과 할당 따로
		Student std;
		std = new Student();
		
		// Student클래스에 대한 객체 std2의 선언과 할당 일괄
		Student std2  = new Student();
		
		System.out.println("std 이름: " + std.name);
		System.out.println("std 나이: " + std.age);
		
		System.out.println("std2 이름: " + std2.name);
		System.out.println("std2 나이: " + std2.age);
		
		std2.name = "JSP학생";
		std2.age = 18;
		System.out.println("std2 이름: " + std2.name);
		System.out.println("std2 나이: " + std2.age);


	}

}
