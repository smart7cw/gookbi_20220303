package condition;

public class Main09 {

	public static void main(String[] args) {
		///////////////////  if, else if, else
		/*
		 * 문제1. 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고, 그렇지 않으면 걸어가라.
		 */
		int money_1 = 2000;
		
		if (money_1 >= 3000) {
			System.out.println("I'll take a taxi.");
		} else {
			System.out.println("I'll walk.");
		}
		System.out.println("-------------------");
		
		/*
		 * 문제2. 만약 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라.
		 */
		int money2 = 4000;
		boolean have_card = false;
		
		if (money2 >= 3000 || have_card) {
			System.out.println("I'll take a taxi.");
		} else {
			System.out.println("I'll walk.");
		}
		System.out.println("-------------------");

		
		/*
		 * 문제3. 어떤 특정 정수값이 짝수이면 "짝수", 홀수이면 "홀수"를 출력하라.
		 */
		int num3 = 4;
		if (num3%2 == 0) {
			System.out.println(num3 + "은/는 짝수");
		} else {
			System.out.println(num3 + "은/는 홀수");
		}
		System.out.println("-------------------");

	
		/*
		 * 문제4. 특정 정수값 a,b,c의 최댓값을 구하여라.
		 */
		int a = 10, b = 20, c = 9;
		System.out.print("Maximum number is ");
		if (a>=b) {
			if (a>=c) {
				System.out.println("a.");
			} else if (b>=c) {
				System.out.println("b.");
			} else {
				System.out.println("c.");
			}
		} else if (b>=c) {
			System.out.println("b.");
		} else {
			System.out.println("c.");	
		}
		
		//더 간단한 정답!!
		int max;
		
		if ( a>b && a>c ) {
			max = a;
		} else {
			
			if ( b>c ) {
				max = b;
			} else {
				max = c;
			}
			
		}
		System.out.println("Maximum number is " + max + ".");
		System.out.println("-------------------");
		
		/*
		 * 문제5-1. 국영수 점수 평균이 95점 이상이면 장학생을 출력해라.
		 * 문제5-2. 그리고 국어점수가 70점 이상이면 "국어 합격" 그렇지 않으면 "국어 불합격"을 출력해라.
		 * 문제5-3. 그리고 수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점",
		 *          60점 이상이면 "D학점", 나머지 점수는 "F학점"을 출력해라.
		 */
		int kor = 90, eng = 80, math = 60;
		float avg = (kor+eng+math)/3;
		if (avg>=95) {
			System.out.println("장학생");
		} else {
			System.out.println("장학생 아님");
		}
		
		if (kor>=70) {
			System.out.println("국어 합격");
		} else {
			System.out.println("국어 불합격");
		}
		
		if (math>=90) {
			System.out.println("A학점");
		} else if (math>=80) {
			System.out.println("B학점");
		} else if (math>=70) {
			System.out.println("C학점");
		} else if (math>=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");	
		}
		System.out.println("-------------------");

		
		///////////////////  switch-case
		/*
		 * 문제1. 1은 "축구", 2는 "농구", 3은 "야구", 4는 "배구", 그 외는 "배드민턴"을 출력해라.
		 */
		int number1 = 5;
		switch (number1) {
		case 1:
			System.out.println("축구");
			break;
		case 2:
			System.out.println("농구");
			break;
		case 3:
			System.out.println("야구");
			break;
		case 4:
			System.out.println("배구");
			break;
		default:
			System.out.println("배드민턴");
			break;
		}
		System.out.println("-------------------");

		
		/*
		 * 문제2. 숫자가 3이면 "안녕"이 세줄, 숫자가 2면 "안녕"이 두줄, 숫자가 1이면 "안녕"이 한줄
		 * 그 외는 "잘가"를 출력해라.
		 */
		 
		int number2 = 5;
		switch (number2) {
		case 3:
			System.out.println("안녕");
		case 2:
			System.out.println("안녕");
		case 1:
			System.out.println("안녕");
			break;
		default:
			System.out.println("잘가");
			break;
		}
		System.out.println("-------------------");

		
		
	}

}
