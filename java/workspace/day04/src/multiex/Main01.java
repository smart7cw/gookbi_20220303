package multiex;

public class Main01 {

	public static void main(String[] args) {

		int target = 100;
		
		//if블록과 else블록에 둘다 똑같은 이름의 "num"이 선언되어도 오류는 일어나지 않는다!
		if ( target == 100 ) {
			int num = target +100;
			System.out.println(num);
		} else {
			int num = target - 100;
			System.out.println(num);
		}
	}

}
