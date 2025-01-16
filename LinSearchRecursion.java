
import java.util.*;

public class LinSearchRecursion {
	public static void main(String[] args) {
		int[] arr= {6,5,4,1,4,6,8,9,7,1,5,4,2,3,8,5,5};
		int target=8;
		System.out.println(isExists(arr,target,0));
	    System.out.println(firstindex(arr, target,0));
//	    ArrayList<Integer> ans= allIndices(arr,8,0);
	    System.out.println(allIndices(arr,8,0));
	    System.out.println(isSorted(arr,0));
	    System.out.println(lastIndex(arr, target, arr.length-1));
	    
	    
	    
	    
	}
	
	private static boolean isExists(int[] arr,int target,int idx) {
		if(idx==arr.length){
			return false;
		}
		
		if(arr[idx]==target) {
			return true;
		}
		
		return isExists(arr, target,  idx+1);
		
	
	}

	private static int firstindex(int [] arr, int target, int idx) {
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==target) {
			return idx;
		}
		
		return firstindex(arr, target, idx+1);
		
	}
	
	private static ArrayList<Integer> allIndices(int[] arr,int target,int idx) {
		
		ArrayList<Integer> ans= new ArrayList<Integer>();
		// base case
		if(idx>=arr.length) {  
			return ans ;
		}
		
		
				
		//self work- just print or add(in the list) the first occurence
		if(arr[idx]==target) {
			//System.out.print(idx+" ");
			ans.add(idx);
		}
		
		// let the recursion print( or add in list named smallans) all remaining  occurences.
		ArrayList<Integer> smallans =allIndices(arr, target, idx+1); 
		
		ans.addAll(smallans);// we have added 'smallans' in 'ans'.
		return ans; // returned finally the ans.
		
	}

	private static boolean isSorted(int[] arr,int idx) {

		
		//base case
		if(idx==arr.length-1) {
			return true;
		}
		
		//self work
		if(arr[idx]>arr[idx+1]) {
			return false;
		}
		
		//let let recursion check whether the remaining array is sorted or not.
		return isSorted(arr, idx+1);
		
		
		
	}

	private static int lastIndex(int [] arr,int target, int idx) {
		if(idx<0) {
			return -1;
		}
		if(arr[idx]==target) {
			return idx;
		}
		
		return lastIndex(arr, target, idx-1);
	}
	
}
