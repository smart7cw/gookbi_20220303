package sudoku;

public class Main01 {

	public static void main(String[] args) {
		
		int[][] prob1 = new int[][] {
			{5,3,0,0,7,0,0,0,0}, //1행 
			{6,0,0,1,9,5,0,0,0}, //2 행 
			{0,9,8,0,0,0,0,6,0},
			{8,0,0,0,6,0,0,0,3},
			{4,0,0,8,0,3,0,0,1},
			{7,0,0,0,2,0,0,0,6},
			{0,6,0,0,0,0,2,8,0},
			{0,0,0,4,1,9,0,0,5},
			{0,0,0,0,8,0,0,7,9}
		};
		
		int[][] prob2 = new int[][] {
			{3,0,0,4},
			{0,4,0,3},
			{4,0,3,0},
			{2,0,0,1},
		};
		
		
		int[][] prob3 = new int[][] {
			{13,0,14,5,0,0,0,3,9,0,8,6,7,11,0,15},
			{0,3,8,0,9,0,13,7,0,15,4,12,26,0,1,5},
			{1,0,16,4,14,15,11,8,7,13,0,5,0,9,6,0},
			{6,9,7,0,2,12,0,10,0,14,16,11,3,8,0,13},
			{0,5,0,2,16,0,9,0,13,0,7,0,8,10,15,0},
			{4,13,6,0,0,8,3,15,12,2,9,0,11,1,0,14},
			{0,14,0,3,0,5,1,4,0,6,11,10,0,13,7,0},
			{8,10,1,0,7,0,2,13,5,4,14,15,6,3,16,12},
			{3,0,0,13,0,10,0,0,15,0,6,7,0,16,0,1},
			{7,16,0,1,5,13,6,14,0,8,12,0,4,0,2,0},
			{9,0,2,14,0,3,7,16,4,11,0,1,0,5,0,8},
			{15,11,5,0,4,0,8,9,14,0,2,0,10,0,3,0},
			{12,15,9,16,3,4,10,1, 11,7,5,8,13,2,14,6},
			{2,4,11,0,0,0,16,0,6,0,1,14,0,7,0,3},
			{5,0,13,6,0,2,0,11,16,3,0,4,1,12,10,9},
			{0,1,3,8,6,7,15,12,10,9,0,0,5,0,11,0},
		};
		
		
		
		System.out.println("스도쿠 문제 풀이");
		System.out.println("----------\n");

		
		//계산기 같이 객체 1개만 생성해서 재활용
		SudokuSolver a = new SudokuSolver();
		
		//9x9 스도쿠 풀기
		a.setArr(prob1);
		a.printer();
		System.out.println("\n----------\n");
		a.solve(0,0);
		
		
		System.out.println("\n----------\n");

		//4x4 스도쿠 풀기
		a.setArr(prob2);
		a.printer();
		System.out.println("\n----------\n");
		a.solve(0,0);
		
		
		System.out.println("\n----------\n");

		//16x16 스도쿠 풀기
		a.setArr(prob3);
		a.printer();
		System.out.println("\n----------\n");
		a.solve(0,0);
		
	}

}