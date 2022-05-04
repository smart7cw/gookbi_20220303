package sudoku;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
	
	static int[][] arr = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < 9 ; i++) {
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int j = 0 ; str.hasMoreTokens();j++) {
			arr[i][j]= Integer.parseInt(str.nextToken());
		}
		}

		dfs(0,0,9);
}
	public static void dfs(int row, int col,int size) {
		
		if(col == size) {
			dfs(row+1,0, size);
			return;
		}
		
		if(row == size) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			
			System.exit(0);
		}
		
		if(arr[row][col]==0) {
			for(int i = 1 ; i <= size ; i++) {
				if(check(row, col, i)) {
					arr[row][col] = i;
					dfs(row, col+1, size);
				}
			}
			arr[row][col]=0;
			return;
		}
		
		dfs(row, col+1, size);
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