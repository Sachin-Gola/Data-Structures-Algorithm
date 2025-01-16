


public class QuickSort {
	public static void quickSort(int[] arr, int low,int high) {
		if(low<high) {
			int pivotIndex=partition(arr,low,high); // putting pivot Element at its correct position .
			quickSort(arr, low, pivotIndex-1); // to sort elements smaller  than pivot.
			quickSort(arr, pivotIndex+1, high);// to sort elements larger  than pivot.
			
		}
	}
	
	public static int partition(int[] arr,int low,int high) {
		int pivotElement=arr[high];
		int i=low-1; // track number of elements smaller than pivot element ( 0 based ).
		
		// Traversing the array upto high-1.
		for(int j=low;j<high;j++) {
			if(arr[j]<pivotElement) {
				i++; // creating spaces only for element  smaller than pivot element.
				
				//swap
				int temp=arr[i];  // saving original element
				arr[i]=arr[j];    // storing element smaller than pivot element.
				arr[j]=temp;      // storing original element.
			}
		}
		
		//swap for pivot index
		i++;  // creating space for pivot element itself.
		int temp=arr[i];
		arr[i]=pivotElement;
		arr[high]=temp;
		return i;  // return the correct index of pivot element.
		
	}
	
	public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

	
	public static void main(String[] args) {
		int[] arr= {6,3,4,8,2,-1};
		int n= arr.length;
		printArray(arr);
		quickSort(arr, 0, n-1);
		printArray(arr);
	}

	
}






























