

public class BinarySearch {
	
	
	
	static int binarySearch(int[] arr,int target) {
		
		int len=arr.length;
		int start=0;
		int end=len-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]){
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,7,8,9,10,13,18,25};
		int target=4;
		System.out.println(binarySearch(arr, target));

	}

}
