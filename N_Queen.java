package java01;


import java.util.Scanner;

public class N_Queen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tq=sc.nextInt();
		int[][] board=new int [n][n];
		int count =solveQueen(board,tq,0,0);
		System.out.println(count);
		sc.close();

	}
	
	public static int solveQueen(int[][] board,int tq,int row,int qp) {
		if(qp==tq) {
			display(board);
			return 1;
		}
		
		if(row==board.length) {
			return 0;
		}
		
		int count=0;
		for(int col=0;col<board[0].length;col++) {
			if(isPossible(board,row,col)) {
				board[row][col]=1;   //We are putting  the queen in the current row. 
				count+=solveQueen(board, tq, row+1, qp+1);  //making call for putting queen in next row.
				board[row][col]=0;
			}
		}
		
		return count;
		
	}
	
	
	public static boolean isPossible(int[][] board,int row,int col) {
		
		
		
		// For column (upward)
		int r=row;
		while(r>=0) {
			if(board[r][col]==1)
				return false;
			r--;
			
		}
		
		// For Right Diagonal( Upward )
		r=row;
		int c=col;
		while(r>=0 && c<=board[0].length-1) {
			if(board[r][c]==1)
				return false;
			r--;
			c++;
		}
		
		// For Left Diagonal ( Upward )
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==1)
				return false;
			r--;
			c--;
		}
		
		return true;
		
	}
	
	public static void display (int[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
