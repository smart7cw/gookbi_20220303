package object;

// 새 클래스 생성, 변수 미리 할당x
class Character{
	//일반적으로 멤버변수는 선언만 하고 할당해놓지 않는다.
	String name;
	int age;
	
}

public class Main02 {
	public static void main(String[] args) {
		// 하나의 클래스가 정의되면, 그 클래스의 구조를 기반으로 하는 객체를 여러개 생성할 수 있다.
		Character d = new Character();
		d.name = "둘리";
		d.age = 20;
		
		Character h = new Character();
		h.name = "희동";
		h.age = 3;
		
		System.out.println("이름: " + d.name + ", 나이: " + d.age);
		System.out.println("이름: " + h.name + ", 나이: " + h.age);
		
	}

}
