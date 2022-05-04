package sudoku;

public class SudokuSolver {
	
	private int size;
	private int[][] puzzle;
	private int[][] result;
		
	public int getSize() { return size; }				//스도쿠 크기에 대한 getter setter
	public void setSize(int size) {this.size = size;}

	public int[][] getArr() { return puzzle; }				// 문제의 스도쿠에 대한 getter setter
	public void setArr(int[][] arr) { this.puzzle = arr; setSize(arr.length); }

	public int[][] getResult() { return result; }						// 풀이한 스도쿠에 대한 getter setter		
	public void setResult(int[][] result) { this.result = result;}

	
	// 스도쿠 문제 프린트하는 함수
	public void printer() {
		int[][] arr = this.puzzle;
		System.out.println(this.size + "x"+ this.size + " 스도쿠 문제");
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

	
	// 스도쿠 본 풀이하는 메서드
	public void solve(int row, int col) {			// (0,0)부터 시작해서 (0,1),(0,2)....(0,8),(1,0),(1,2),...(8,8)까지 확인한다.
		
		if(col == this.size) {						// 열 맨 끝 (0,9)에 도달하면 다음 열 맨 처음 (1,0)으로 가서 메서드를 실행한다.
			solve(row+1,0);
			return;
		}
		
		
		
		if(row == this.size) {												// row가 9라는 뜻은 (0,0)부터 (8,8)까지 다 확인했다는 뜻이므로 결과를 출력한다.
			setResult(this.puzzle);
			//결과 출력 
			int[][] result = this.result;
			
			System.out.println("풀이결과");
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					if (result[i][j]==0) {
						System.out.print("* ");
					} else {
						System.out.print(result[i][j]+" ");
					}
				}
				System.out.println();
			}
			return;
		}
		
	
		
		if(puzzle[row][col]==0) {									//0 발견 시
			for(int i = 1 ; i <= this.size ; i++) {				// 1~9 중 스도쿠 조건을 만족하는 = check에서 true를 반환하는 숫자를 0 위치에 집어넣는다.
				if(check(row, col, i)) {
					puzzle[row][col] = i;
					solve(row, col+1);							// 집어넣으면 (0,1)에서 (0,2)로 넘어간다.
				}
			}
			puzzle[row][col]=0;
			return;
		}
		
		solve(row, col+1);										// 0이 아닌 숫자가 잘 들어가 있으면 (0,1)에서 (0,2)로 넘어간다.
	}
	
	
	
	
	
	// 특정 스도쿠 위치에서 알맞는 숫자 확인하는 메서드
	public boolean check(int row, int col, int number) {
		
		int size = this.size;
		int size_small = (int)Math.sqrt(size);
		
		//같은 열에 무슨 숫자가 비었는지 확인. 해당 number가 열에 존재하면 false 반환.
		for(int i = 0 ; i < size ; i ++) {
			if(puzzle[row][i] == number) {
				return false;
			}
		}
		
		//같은 행에 무슨 숫자가 비었는지 확인.  해당 number가 행에 존재하면 false 반환.
		for(int i = 0 ; i < size ; i ++) {
			if(puzzle[i][col] == number) {
				return false;
			}
		}
		
		//같은 박스에 무슨 숫자가 비었는지 확인.  해당 number가 박스에 존재하면 false 반환.
		int box_row = (row/size_small)*size_small;				// 0,1,2번째->0번째로 통일
		int box_col = (col/size_small)*size_small;				// 3,4,5번째 ->3번째로 통일
		
		for(int i = box_row ; i < box_row+size_small ; i ++) {			// 0번째에서 시작하는 박스 안의 모든 수 체크 가능
			for(int j = box_col ; j < box_col+size_small ; j++) {
				if(puzzle[i][j] == number)
					return false;
			}
		}

		return true;		//해당 숫자가 세 경우 모두 존재하지 않으면 true 반환
	}
	

	
}
