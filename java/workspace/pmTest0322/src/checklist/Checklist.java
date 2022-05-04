package checklist;

public class Checklist {

	public static void main(String[] args) {
		//문제1. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);
		
		
		System.out.println("--------------");
		//문제2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr2 = {
				{5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int total = 0;
		int size = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				total += arr2[i][j];
				size++;
			}
		}
		System.out.println("total=" + total);
		System.out.println("average=" + total/size);
		

		System.out.println("--------------");
		//문제3. 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		//단 가능한 한 적은 수의 동전으로 거슬러 주어야한다 (1)에 알맞은 코드를 넣어서(1줄 이상 일 수 있다), 프로그램을 완성하시오.
        int[] coinUnit = { 500, 100, 50, 10 };
        int money = 2680;

        System.out.println("money=" + money);

        for (int i = 0; i < coinUnit.length; i++) {
        	//(1)
        	int num = money/coinUnit[i];
        	money = money%coinUnit[i];
        	System.out.println(coinUnit[i]+"원"+" : "+num);
        }
		
        
		System.out.println("--------------");
		//문제4. num 배열에 저장된 요소의 최대값을 출력하시오.
		int[] num = { 94, 85, 95, 88, 90 };
		int max = -9999;
		
		for (int i = 0; i < num.length; i++) {
			if ( max<num[i] ) {
				max = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		
		System.out.println("--------------");
		//문제5. num 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오.
		int[] num3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int even = 0;
		int odd = 0;
		
		for (int i = 0; i < num3.length; i++) {
			if ( num3[i]%2==0 ) {
				even += num3[i];
				continue;
			}
			odd += num3[i];
		}
		System.out.println("짝수 : " + even + "\n홀수 : " + odd);
		

		
	}

}
