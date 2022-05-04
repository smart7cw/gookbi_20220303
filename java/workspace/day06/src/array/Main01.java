package array;

public class Main01 {

	public static void main(String[] args) {

		// 성적표에 대한 2차 배열을 생성한다.
		int[][] grade = new int[3][3];
		
		//둘리의 과목별 점수
		grade[0][0] = 75;
		grade[0][1] = 82;
		grade[0][2] = 91;
		
		//둘리의 과목별 점수
		grade[1][0] = 88;
		grade[1][1] = 64;
		grade[1][2] = 50;
		
		//둘리의 과목별 점수
		grade[2][0] = 100;
		grade[2][1] = 100;
		grade[2][2] = 90;
		
		//과목별 점수 확인
		for (int i = 0; i < grade.length; i++) {
			
			// 같은 i행에서 열번호를 증가시키면서, 한 사람의 점수를 순차적으로 출력함
			for (int j = 0; j < grade[i].length; j++) {
				System.out.print(grade[i][j] + "	");
			}
			
			System.out.println("");
			// 반복 1회가 끝나면 다음 행으로 넘어가서, 다음 사람의 점수를 순차적으로 출력함
		}
		
		
		
		//사람별 총점 및 평균 확인
		for (int i=0; i<grade.length; i++) {
			// 변수 sum과 avg는 새로운 열(사람)으로 넘어갈 때마다 초기화된다.
			int sum = 0;
			float avg;
			int len = grade.length;
			
			// 같은 행에서 열번호를 증가시키면서 총합을 구함
			for (int j=0; j<grade[i].length; j++) {
				sum += grade[i][j];
			}
			
			avg = (float) sum / len ;
			
			System.out.println("총합 : " + sum);
			System.out.printf("평균 : %.1f \n-----\n" , avg);
			// 반복 1회가 끝나면 다음 행으로 넘어가서, 다음 사람의 점수를 사용해 계산함.
		}
		
			
	}

}
