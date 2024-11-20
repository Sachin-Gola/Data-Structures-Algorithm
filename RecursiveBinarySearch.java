package java01;

public class RecursiveBinarySearch {
	
	static boolean recursiveBinarySearch(int[] arr,int start,int end,int target) {
		
		if(start>end) {   // base case
			return false;
		}
		
		int mid=start +(end-start)/2;
		
		if(arr[mid]==target) {     // self work
			return true;
			
		}
		else if(target<arr[mid]) {
			 return recursiveBinarySearch(arr, start, mid-1, target); // sub problem
		}
		else {
			return recursiveBinarySearch(arr, mid+1, end, target);
		}
		

	}
	

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,9,10,15,16};
		int target=5;
		System.out.println(recursiveBinarySearch(arr, 0, arr.length-1, target));
		
	}

}
