package object;


class User{
	String name;
	String subject;
	int age;
	String hobby;
	
	public void setName( String name, String hobby ) {
		//지역변수와 전역변수의 지정 구분으로서의 this 사용
		System.out.println( name );
		System.out.println( this.name );	// 전역변수에 name이 있어야만 this를 사용할 수 있다. 없으면 오류.
		
		// 지역변수 없는 전역변수 이름에 this를 사용해도 무방하나, 권장하지는 않음.
		subject = "국비지원";
		this.age = 25;
		System.out.println( subject );
		System.out.println( this.subject );

		// 파라미터(지역변수)로 받은 값을 전역변수에 할당하고 싶은 경우
		this.hobby = hobby;   // 전역변수hobby = 파라미터hobby;
		
		System.out.println( "과목: " + this.subject + ", 나이: " + this.age + ", 취미: " + this.hobby );

	}
}

public class Main05 {

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "JSP학생";
		u1.setName("자바학생", "독서");
		// 메서드 내부 name은 지역변수를 의미하고
		// this.name은 전역변수 name을 의미한다.
		// 또한 전역변수 subject나
		// this.subject나 동일하게 전역변수를 의미한다.
		// 파라미터로 받은 지역변수값 "독서"를  this를 사용하여 전역변수에 잘 옮겨줬다.
	}

}
