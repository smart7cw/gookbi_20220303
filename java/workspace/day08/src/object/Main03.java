package object;

class Book{
	String subject;	// 책 주제
	String content;	// 책 내용
	
	// 생성자란, 객체가 생성될 때 자동으로 실행되는 특수한 메서드
	// 리턴형을 명시하지 않고, 클래스와 이름이 동일하다는 게 특징이다.
	Book() {	//이걸 딱히 생성해놓지 않아도 컴파일러가 자동을 생성 및 실행한다.
		System.out.println("기본 생성자 호출 확인!");
		this.subject = "JAVA 입문";
		this.content = "JAVA란 무엇인가";
		// 위처럼 코드를 짜면 객체가 생성되면서 자동으로 멤버변수들에게 값이 할당된다 = 초기화된다.
	}
	
	void read() {
		//생성자로 인하여 초기화된 멤버변수 값을 확인할 수 있다.
		System.out.println("read() 메서드 실행!");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}

public class Main03 {
	public static void main(String[] args) {

		Book book = new Book();
		// Book클래스의 생성자에서 멤버변수 기본값을 설정하도록 했기 때문에
		// 위처럼 객체를 생성하는 것만으로 멤버변수에 초기화된다(기본값이 할당된다).
		book.read();	
		
	}

}
