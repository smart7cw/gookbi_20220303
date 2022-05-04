package operator;

public class Main06 {
	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 456;
		
		boolean result1 = num1 == num2;  // 거짓
		boolean result2 = num1 != num2;  // 참
		boolean result3 = num1 > num2;  // 거짓
		boolean result4 = num1 <= num2;  // 참
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
	}
}
