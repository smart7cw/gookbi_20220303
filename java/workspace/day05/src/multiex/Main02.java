package multiex;

public class Main02 {

	public static void main(String[] args) {

		// continue, break 연습
		// 1~100까지 홀수의 합을 구해보자.
		
		int sum = 0, i=0;
		
		while ( true ) {
			i++;
			if (i%2==0) {	// 짝수일 경우 통과(continue)
				continue;
			}
			if ( i>100 ) {	// i가 100보다 커지면 종료(break). 없으면 무한루프.
				break;
			}
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
