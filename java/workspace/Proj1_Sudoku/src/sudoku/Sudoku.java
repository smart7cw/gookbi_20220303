package sudoku;

import java.util.Arrays;	//array 비교에 사용 Array.equals(arr1, arr2)

public class Sudoku {

	public static void main(String[] args) {
		int[][] prob={
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
		
		Printer(prob);
		System.out.println("----------");
		Printer(readZero(prob));
		System.out.println(3* (int)Math.pow(10,3));
		
		
	}
	
	//숫자, 난이도 입력받아 그 크기의 스도쿠 문제 생성하는 함수
	// 숫자는 4 9 16 입력받기.
	// 최소난이도는 힌트 (n^2-3*n)개, 최대 난이도는 최소 힌트 개수
	// 4x4는 힌트 4~8개 / 9x9는 힌트 16~54개 / 16x16은 힌트 55~208개
	// 난이도 LVA123 LVB123 LVC123   난이도1 min~min+(max-min)/3
	// 난이도2 min+(max-min)/3~min+2*(max-min)/3
	// 난이도3 min+2*(max-min)/3 ~ max
	
	
	// 스도쿠 문제/답 프린트하는 함수
	public static void Printer(int[][] arr) {
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
	
	// 스도쿠 문제 0 좌표 반환하는 함수
	public static int[][] readZero(int[][] arr) {
		int num_zeroes = countZero(arr);
		int[][] coord = new int[num_zeroes][2];
		int row = 0, col = 0, num = -1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				row = 0; col = 0;
				if (arr[i][j]==0) {
					num++;
					coord[num][0] = i;
					coord[num][1] = j;
				}
			}
		}
		return coord;
	}
	
	public static int[] caseRow(int[][] arr, int row) {
		int[] reserve = new int[] {1,2,3,4,5,6,7,8,9};	//reserve = 987654321;
		int num = 0;
		for (int i = 0; i < arr[row].length; i++) {
			num = arr[row][i];
			if(num!=0) { reserve[num-1] = 0; } 			 	//reserve -= num* (int)Math.pow(10,num-1);	
			}
		return reserve;
	}
	
	
	public static int[] caseCol(int[][] arr, int col) {
		int[] reserve = new int[] {1,2,3,4,5,6,7,8,9};
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i][col];
			if(num!=0) { reserve[num-1] = 0; } 			 	//reserve -= num* (int)Math.pow(10,num-1);	
			}
		return reserve;
	}
	
	
	public static int[] caseBox(int[][] arr, int row, int col) {
		int[] reserve = new int[] {1,2,3,4,5,6,7,8,9};
		int num = 0;
		int start_row = (row/3)*3;
		int start_col = (col/3)*3;
		
		for (int i = start_row; i < start_row+3 ; i++) {
			for (int j = start_col; j < start_col+3 ; j++) {
				num = arr[i][j];
				if(num!=0) { reserve[num-1] = 0; }
			}
		}
		return reserve;
	}
	
	
	public static int[] caseTotal(int[][] arr, int row, int col) {
		int[] case1 = caseRow(arr, row);
		int[] case2 = caseCol(arr, col);
		int[] case3 = caseBox(arr, row, col);
		
		int[] reserve_final = new int[] {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < case1.length; i++) {
			if (case1[i]==0 || case2[i]==0 || case3[i]==0) {
				reserve_final[i] = 0;
			}
		}
		return reserve_final;
	}
	
	

	
	public static void dfs(int p) {
		
		int[][] coord = readZero(arr);
		int row_num = coord[row][0];
		int col_num = coord[row][1];
		
		int[] cases = caseTotal(arr,row_num,col_num);	//1,5,6
		
		cases = 1,5,6
				

				case[0] -> p=2 not ok, 
				
				case[1] -> p=2 = ok  -> row=2
		
		col = dfs2(cases.count)
		
		public static void dfs2(int col) {
			
			if (Arrays.equals(cases,zero_array)) {
				dfs(row-1,col+1);
			}
			
			dfs(row+1,1);
			
			if(row==coord.length+2){
				return all ok;
			}
		}
		
		
		if ok -> row+1, 1 + if blank_index = end -> return ok
		if not ok  -> row-1,col+1

	
	}
	
	public static void Solver(int[][] arr) {
		int[][] coord = readZero(arr);
		int[] zero_array = new int[9];
		
		
		for (int i = 0; i < coord.length; i++) {
			int row_num = coord[i][0];
			int col_num = coord[i][1];
			int[] cases = caseTotal(arr,row_num,col_num);
			
			
			
			
			for (int j = 0; j < cases.length && cases[j]!=0; j++) {
				int candidate = cases[j];
				arr[row_num][col_num] = candidate;
				
				
				
				
			}
			if (Arrays.equals(cases,zero_array)) { continue; }

			//for (int t = 1; t <= arr.length+1 ; t++)
		}
	}
	
	

}
