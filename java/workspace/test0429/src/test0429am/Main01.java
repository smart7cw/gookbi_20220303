//문제1~12: collection framework 중의 하나인 arraylist를 사용해서 학생 관리를 하자.
//1. java 프로젝트 생성하여(이름은 자유) arraylist package를 생성한다.(10) 
package test0429am;

import java.util.ArrayList;	//7번에 필요

import java.util.List;

//2. arraylist package안에 Student 클래스, main 메서드를 포함하고있는 클래스(이름은 자유)를 생성한다.(10) 
public class Main01 {

	public static void main(String[] args) {
		
		//7. Student 객체를 담기위한 arraylist 생성.(객체명 자유)(10)
		List<Student> slist = new ArrayList<Student>();
		// ArrayList<Student> slist = ~ 도 가능함
		
		//8. 7번에서 생성한 객체에 for문을 사용하여 10명의 학생 데이터를 임의로 각각 다르게 add한다.(5)
		for (int i = 1; i <= 10; i++) {
			Student s = new Student("학생"+i, "010-1234-000"+i, "서울특별시 관악구 관악로 " + i);
			slist.add(s);
		}
		
		//9. 7번에서 생성한 arraylist의 크기를 출력한다.(10)
		System.out.println("arraylist 데이터 크기: " + slist.size());
		
		//10. 7번에서 생성한 arraylist의 5번째 요소를 출력한다.(5)
		System.out.println("arraylist 5번째 요소: " + slist.get(4));
		
		//11. 7번에서 생성한 arraylist의 5번째 요소를 삭제한다.(5)
		slist.remove(4);
		
		//12. 7번에서 생성한 arraylist에 담긴 데이터를 for문과 Student 클래스에서 생성한 toString() 메서드를 사용하여 출력한다.(5)
		for (int i = 0; i < slist.size() ; i++) {
			Student s2 = slist.get(i);
			System.out.println(s2.toString());
			System.out.println("----------------");
		}
		
	}

}
