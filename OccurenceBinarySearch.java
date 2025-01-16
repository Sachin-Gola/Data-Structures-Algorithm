


public class OccurenceBinarySearch {
	
	static int lastOccurence(int[] arr,int target) {
		
		int lastIndex=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target) {
				lastIndex=mid;
				start=mid+1; //In ascending order,last occurence can only be appear in right side.
				
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return lastIndex;
	}
	
	
	
	static int firstOccurence(int[] arr,int target) {
		int firstIndex=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid= start +(end-start)/2;
			
			if(arr[mid]==target) {
				firstIndex=mid;
				end=mid-1;  // In ascending order, first occurence can only be appear in left side.
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		return firstIndex;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,2,2,3,4,4,5,5,5,5,7,9,10,15,16};
		int target=5;
		System.out.println(firstOccurence(arr, target));
		System.out.println(lastOccurence(arr, target));

	}

}
