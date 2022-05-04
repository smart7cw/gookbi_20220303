package object;

class Member{
	String name;
	int age;
	// 문제1. getName(), 멤버변수 name를 반환할 것.
	public String getName() { return this.name; } //return name; 도 동일하게 가능함 
	
	// setName(), 멤버변수 name 값을 param name에 할당할 것.
	public void setName(String name) { this.name = name; }
	
	//문제2. getAge(), 멤버변수 age를 반환할 것.
	public int getAge() { return this.age; }
	
	// setAge(), 멤버변수 age 값을 param age에 할당할 것.
	public void setAge(int age) { this.age = age; }
	
	// say(), getName()과 getAge의 반환값을 각각 출력할 것.
	public void say() {
		System.out.println("이름: " + getName());
		//System.out.println("이름: " + this.getName()); 도 동일하게 가능함
		System.out.println("나이: " + getAge());

	}
}

public class Main02 {
	public static void main(String[] args) {
		// Member class 객체 생성하기.
		// 메서드를 사용해서 전역변수 name age에 임의의 데이터를 할당하기.
		// say() 메서드 호출하기.
		Member m = new Member();
		
		m.setName("김찬우"); m.setAge(26);	//setXxxx 호출 -> 전역변수 this.xxx에 입력값 할당
		//m.name = "김찬우"; m.age = 26;
		m.say();
		
		m.setName("김미주"); m.setAge(21);
		m.say();


	}

}
