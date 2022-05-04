package object;


class Student {
	int age;
	//Student클래스 입장에서는 전역변수뿐만 아니라, 메서드 getName과 sayName을 this로 접근할 수는 있다. 통상적으로 this는 메서드에 쓰지는 않는다.
	public String getName() {
		String name = "자바학생";
		return name;
	}
	
	public void sayName() {
		String myname = getName();	 		 //통상적으로 메서드에는 this를 쓸수 있어도 사용하지는 않는다.
		//String myname = this.getName();	 //getName메서드를 this를 사용해 호출 가능하다.
		System.out.println(myname);
	}
}


public class Main01 {
	public static void main(String[] args) {
		
		Student std = new Student();
		std.sayName();					// sayName 호출 -> this로 인해 sayName 호출
										// -> myname에 name의 값인 "자바학생"을 할당 -> myname 출력
		
	}

}
