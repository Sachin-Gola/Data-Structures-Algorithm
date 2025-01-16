
import java.util.Arrays;
public class PrimeNumbersRange {

	public static void main(String[] args) {
		int count=0;
		int n=7;
		boolean board[] =new boolean[n+1];
		Arrays.fill(board,true);
		for(int i=2;i*i<n;i++){
			if(board[i]==true){
				for(int j=i*2;j<n;j+=i){
					board[j]=false;
				}
			}
		}
		for(int i=2;i<n;i++){
			if (board[i]==true) count++;
		}
		System.out.println(count);
		

	}

}
