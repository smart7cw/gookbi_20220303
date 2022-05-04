package method;

/*
 * 거스름돈
 * 문제 : 지불한 금액을 나타내는 파라미터1, 물건의 가격을 나타내는 파라미터2
 * 		이렇게 두 개의 파라미터를 받아 가작 적은 수의 지폐를 거슬러 주는 메소드를 만들어 주세요.
 * 		(단위는 50000, 10000, 5000, 1000 원입니다.)
 * 
 * 예) change(100000, 23000);
 * 	출력결과 -> 50000원 지폐 : 1장
 * 		 	 10000원 지폐 : 2장 
 * 			  5000원	지폐 : 1장
 * 			  1000원 지폐 : 2장
 */	

public class Change {

	public static void main(String[] args) {
		change(100000, 23050);
	}
	
	public static void change(int pay, int price) {
		
		int change = pay - price;
		int[] bills = {50000, 10000, 5000, 1000};
		for (int i = 0; i < bills.length; i++) {
			int bill = bills[i];							// 큰액수 지폐
			int num = change/bill;							// 큰액수 지폐 개수
			change = change%bill;							// 큰액수 지폐로 거슬러줄 수 없는 거스름돈 재할당
			System.out.println(bill + "원 지폐 : " + num);
		}
		System.out.println("지폐로 줄 수 없는 거스름돈: " + change);

	}

}
