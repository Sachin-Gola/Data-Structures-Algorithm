package java01;


public class Sudoku {

	public static void main(String[] args) {
		   char [][] board= {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
		            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
		            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
		            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
		            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
		            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
		            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
		            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
		   solve(board, 0, 0);
		   for(int i=0;i<board.length;i++) {
			   for(int j=0;j<board.length;j++) {
				   System.out.print(board[i][j]+" ");
			   }
			   System.out.println();
		   }
	}
	 public static boolean solve(char[][] board,int row,int col){
	        
	        

	        if(col==board.length){
	            col=0;
	            row=row+1;
	        }
	        if(row==board.length){
	            return true;             
	        }
	        
	        
            if(board[row][col] != '.'){
	            if(solve(board,row,col+1)){
	                return true;
	            }
	        }
	        else{
	            for(int i=1;i<=9;i++){
	                if(check(board,row,col,i)){
	                    board[row][col]= (char)(i+'0');
	                    if(solve(board,row,col+1)){
	                        return true;
	                    }
	                    else{
	                        board[row][col]='.';
	                    }
	                }
	            
	                
	                    
	            }
	        }
	        return false;
	    }

	    private static boolean check(char[][] grid,int row,int col,int num){
	        int r=row;
	        int c=col;

	        //for row
	        for(int i=0;i<grid.length;i++){
	            if(grid[i][c] == (char)(num+'0')){
	                return false;
	            }
	        }
	        //for column
	        for(int i=0;i<grid[0].length;i++){
	            if(grid[r][i] == (char)(num+'0')){
	                return false;
	            }
	        }

	        r=row-row%3;
	        c=col-col%3;

	        //for 3*3 matrix
	        for(int i=r;i<r+3;i++){
	            for(int j=c;j<c+3;j++){
	                if(grid[i][j]== (char)(num+'0')){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
}