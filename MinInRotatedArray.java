package java01;



public class MinInRotatedArray {
	
	static boolean searchDuplicateIndex(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		while(start<= end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return true;
			}
			else if(arr[start]==arr[mid] && arr[mid]==arr[end]) {  // to remove useless elements.
				start++;
				end--;
			}
			else if (arr[mid]<=arr[end]) {  // mid to end is sorted
				if(arr[mid]<target && arr[end]>=target) {     // checking extremes.
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else {               // start to end is sorted
				if(arr[mid]>target && arr[start]<=target) {  // checking extremes.
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return false;
	}
	
	
	static int findIndex(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		while(start<= end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if (arr[mid]<arr[end]) {  // mid to end is sorted
				if(arr[mid]<target && arr[end]>=target) {     // checking extremes.
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else {               // start to end is sorted
				if(arr[mid]>target && arr[start]<=target) {  // checking extremes.
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return -1;
	}
	
	static int minRotatedArray(int[] arr ) {
		int ans=-1;
		int start=0;
		int size=arr.length;
		int end=size-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[size-1]) {       // If mid is greater than the last element, we need move forward from mid, hence start updated.
				start=mid+1;
			}
			else if(arr[mid]<=arr[size-1]) {  // If mid is smaller than or equals to last element, we upadated answer, and move backward (to find minimum) from mid.
				ans=mid;
				end=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr= {3,4,5,6,1,2};
		int[] arr2= {3,3,3,4,5,6,1,1,1,2,2,2};
		System.out.println(minRotatedArray(arr));
		System.out.println(findIndex(arr, 6));
		System.out.println(searchDuplicateIndex(arr2, 3));
		

	}

}
