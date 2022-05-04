package sudoku;

public class Sudoku2 {

	static int[][] arr = new int[][] {
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
	
	public static void main(String[] args) {
		
		printer(arr);
		System.out.println("----------");
		
		solver(0,0);
	
	}

	
	// 스도쿠 문제/답 프린트하는 함수
	public static void printer(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]==0) {
					System.out.print("* ");
				} else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	//스도쿠 문제 0 개수 반환하는 함수
	public static int countZero(int[][] arr) {
		int num_zeroes = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]==0) {
					num_zeroes++;
				}
			}
		}
		return num_zeroes;
	}

	
	public static void solver(int row, int col) {
		
		if(col == 9) {
			solver(row+1,0);
			return;
		}
		
		if(row == 9) {
			printer(arr);
			System.exit(0);
		}
		
		if(arr[row][col]==0) {
			for(int i = 1 ; i <= 9 ; i++) {
				if(check(row, col, i)) {
					arr[row][col] = i;
					solver(row, col+1);
				}
			}
			arr[row][col]=0;
			return;
		}
		
		solver(row, col+1);
	}
	
	public static boolean check(int row, int col, int value) {
		
		//같은열에 무슨 숫자가 비었는지
		for(int i = 0 ; i < 9 ; i ++) {
			if(arr[row][i] == value) {
				return false;
			}
		}
		
		//같은행에 무슨 숫자가 비었는지
		for(int i = 0 ; i < 9 ; i ++) {
			if(arr[i][col] == value) {
				return false;
			}
		}
		
		//같은 네모에 뭐가 있는지
		int ind_row = (row/3)*3;
		int ind_col = (col/3)*3;
		
		for(int i = ind_row ; i < ind_row+3 ; i ++) {
			for(int j = ind_col ; j < ind_col +3 ; j++) {
				if(arr[i][j] == value)
					return false;
			}
		}
		
		return true;
	}
	

}