package object;

class StudentUser{
	String name;
	public void setName ( String name ) {
		this.name = name;
	}
	public String getName () {
		return this.name;		// 이 메서드에는 지역변수name은 없으므로 this를 사용하지 않아도 되지만
		//return name;			// 가독성을 위해 필요치 않아도 전역변수이면 this를 붙여주는 게 보편적이다.
	}
}


public class Main06 {

	public static void main(String[] args) {
		/*
		 * 문제. StudentUser 클래스를 사용하여 객체를 생성 후 객체의 메서드만을 사용해서
		 * 전역변수 name에 "자바학생"을 할당하고 출력하여라.
		 */
		StudentUser u1 = new StudentUser();
		
		System.out.println(u1.getName());	//전역변수name이 아무것도 할당되지 않은 상태. null 반환.
		
		u1.setName("자바학생");				// this 사용하여 전역변수에 지역변수의 값을 할당함.
		
		String result = u1.getName();		//전역변수name에 할당된 지역변수값 반환.
		System.out.println(result);			
	
		}

}
