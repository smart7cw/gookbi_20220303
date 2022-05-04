package loop;

public class Main06 {

	public static void main(String[] args) {

		// 반복문 do~while 연습
		// 구구단 7단 출력 
		
		int result;
		int i = 1;
		
		do {
			result = 7*i;
			System.out.println("7 x " + i + " = " + result);
			i++;
		} while (i<=9);

	}
}
