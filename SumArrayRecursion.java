

public class SumArrayRecursion {
	public static void main(String[] args) {
		int[] arr= {1,8,6,5,9};
		System.out.println(sumArrayIdx(arr,0));
	}
	private static int sumArrayIdx(int[] arr,int idx) {
		//base case
		if(idx==arr.length) {
			return 0;
		}
		
		//recursion
		int sumOfRemaining=sumArrayIdx(arr, idx+1);
		
		//self work and return
		return sumOfRemaining+arr[idx];

	}


}
