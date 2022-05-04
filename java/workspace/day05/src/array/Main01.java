package array;

public class Main01 {

	public static void main(String[] args) {

		// 둘리, 도우너, 또치의 점수에 대한 배열을 만들어 활용해보자.
		// 배열의 선언, 크기 지정, 값의 할당 (개별처리)
		///*
		int[] dooly;		// 선언.
		dooly = new int[5];	// 크기 지정. 이상태까지는 모든 상자에 "0"이 들어가 있다.
		dooly[0] = 75;		// 값의 할당.
		dooly[1] = 82;
		dooly[2] = 91;
		dooly[4] = 100;
		
		// 배열의 선언 + 크기 지정 (일괄처리), 값의 할당 (개별처리)
		int[] douneo = new int[3];	// 선언 + 크기 지정. 이상태까지는 모든 상자에 "0"이 들어가 있다.
		douneo[0] = 88;		// 값의 할당.
		douneo[1] = 64;
		douneo[2] = 50;
		
		// 배열의 선언 + 크기 지정 + 값의 할당 (일괄처리)
		
		int[] ddochy = {100, 100, 90};	// 선언 + 크기 지정 + 값의 할당.
		
		for (int i=0; i<dooly.length; i++) {
			System.out.print(dooly[i]+ " ");
		}
		System.out.println("");
		for (int i=0; i<douneo.length; i++) {
			System.out.print(douneo[i]+ " ");
		}
		System.out.println("");
		for (int i=0; i<ddochy.length; i++) {
			System.out.print(ddochy[i]+ " ");
		}
		System.out.println("");
		
		// 배열의 활용 - 사람별 점수 합을 할당한 변수 선언 및 할당해보자.
		// 합 변수 선언
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		// 각 배열 요소의 합 구하기
		for (int i=0; i < dooly.length; i++) {
			sum1 += dooly[i];
		}
		System.out.println("dooly sum1 : " + sum1);
		
		for (int i=0; i < douneo.length; i++) {
			sum2 += douneo[i];
		}
		System.out.println("douneo sum2 : " + sum2);
		
		for (int i=0; i < ddochy.length; i++) {
			sum3 += ddochy[i];
		}
		System.out.println("ddochy sum3 : " + sum3);
		
		// + 명시적 형변환의 확인
		float a1 = sum2/3;			// int/int 연산으로 int결과값을 float그릇에 할당함. 따라서 결과는 67->"67.0"
		float a2 = sum2/3f;			// int/float 연산으로 float결과값을 float그릇에 할당함. 따라서 결과는 67.33336->"67.33336"
		float a3 = (float) 4/3;		// (float)4/3->4.0f/3->"1.33334"
		float a4 = (float) (4/3);	// 1->"1.0" 

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);	
		System.out.println(a4);	
			

	}

}
