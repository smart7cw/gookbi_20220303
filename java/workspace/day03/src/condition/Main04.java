package condition;

public class Main04 {

	public static void main(String[] args) {

		//70초과 80이하를 C, 80초과 90이하를 B, 90초과 100이하를 A,
		//그 외 나머지를 F로 학점을 처리하도록 조건문을 작성하라.
		int point = 87;
		
		if ( point > 90 && point >=100 ) {
			System.out.println("A");
		} else if ( point > 80 && point <= 90 ) {
			System.out.println("B");
		} else if ( point > 70 && point <= 80 ) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}
	
	}

}
