package object;

// 새 클래스 생성. 전역변수와 지역변수의 차이 이해.
class HelloWorld{
	//멤버변수(전역변수)는 모든 메서드가 공유한다.
	String message;
	
	
	// 모든 메서드에서 전역변수인 message를 사용해서 출력하거나 재할당할 수 있다.
	void sayHello() {
		System.out.println(message);
	}
	
	void setEng() {
		message = "Hello Java";
	}
	
	void setKor() {
		message = "안녕하세요 자바";
	}
	
}

public class Main03 {

	public static void main(String[] args) {

		//객체 생성
		HelloWorld hello = new HelloWorld();
		
		//hello객체의 메서드 호출
		hello.sayHello();	//message 할당 전에 출력하면 default인 null이 출력된다.
		hello.setEng();
		hello.sayHello();	//message 할당한 후 출력하면 Hello Java 가 출력된다.
		
		hello.setKor();
		hello.sayHello();	//message 재할당한 후 출력하면 안녕하세요 자바 가 출력된다.
		
		
	}

}
