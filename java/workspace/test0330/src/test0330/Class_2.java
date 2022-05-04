package test0330;
/*
[SQL응용 문제 답변 - 김찬우8970]
1. Student 클래스를 생성 한다.(10점)
2. Student 클래스에 private 접근제어의 String 타입의 name, int 타입의 ban, no, kor, eng, math변수 선언(10점)
3. 파라미터가 있는 생성자, getter, setter를 생성한다.(10)
4. kor, eng, math의 총합을 return하는 메서드 생성.(10)
5. kor, eng, math의 평균값을 return하는 메서드를 생성(10)
6. name, ban, no, kor, eng, math 를 출력하는 메서드 생성(10)
7. main 메서드를 포함하는 클래스를 생성(10)
8. Student 클래스 객체 생성(10)
9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출(10)
10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출(10)
*/

class Student {	//1. Student클래스 생성
	private String name;					//2. 멤버변수 선언
	private int ban, no, kor, eng, math;
	
	public String getName() { return this.name; }				//3. 모든 멤버변수에 대한 getter, setter 생성
	public void setName(String name) { this.name = name; }
	public int getBan() { return this.ban; }
	public void setBan(int ban) { this.ban = ban; }
	public int getNo() { return this.ban; }
	public void setNo(int no) { this.no = no; }
	public int getKor() { return this.kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return this.eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return this.math; }
	public void setMath(int math) { this.math = math; }
	
	Student(String name, int ban, int no, int kor, int eng, int math) {			//3. 파라미터 있는 생성자 선언. 파라미터는 멤버변수에 할당할 값임
		setName(name);
		setBan(ban);
		setNo(no);
		setKor(kor);
		setEng(eng);
		setMath(math);
	}
	public int total() { return this.kor + this.eng + this.math; }		//4. 국영수 점수 총합 반환하는 메서드 생성
	public int average() { return total()/3; }							//5. 국영수 점수 평균 반환하는 메서드 생성. total메서드를 활용함
	public void openGrade() {											//6. 모든 정보 출력하는 메서드 생성
	 	System.out.println("이름: " + this.name);
	 	System.out.println("반: " + this.ban);
	 	System.out.println("번호: " + this.no);
	 	System.out.println("국어: " + this.kor);
	 	System.out.println("영어: " + this.eng);
	 	System.out.println("수학: " + this.math);
	}
}


public class Class_2 {		//7. main메서드 포함하는 클래스 생성

	public static void main(String[] args) {
		Student s = new Student("김찬우", 10, 11, 90, 10, 50);	//8. 객체 s 생성과 동시에 멤버변수에 setter로 값 할당
		System.out.println("국영수 총합: " + s.total());			//9. 점수 총합, 평균값 반환 메서드 호출하고 출력
		System.out.println("국영수 평균: " + s.average());
		System.out.println("-----------");
		
		s.openGrade();								//10. 정보 출력하는 openGrade 호출

	}

}
