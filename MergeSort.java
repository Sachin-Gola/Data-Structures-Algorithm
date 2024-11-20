public class MergeSort {
	public static void merge(int[] arr,int start,int mid, int end){
        // size of two sub arrays
        int s1=mid-start+1;
        int s2=end-mid;

        // creating two temporary arrays
        int L[]=new int[s1];
        int R[]=new int[s2];

        // copying data to temporary arrays
        for(int i=0;i<s1;i++){
            L[i]=arr[start+i];
        }
        for(int j=0;j<s2;j++){
            R[j]=arr[mid+1+j];
        }

        // Now we will merge the two sorted arrays:

        // To point both subarrays, we will use two variables:
        int i=0,j=0;

        // Intitial index of merged subarrays:
        int k=start;

        while(i<s1 && j<s2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
                k++;
            }
            else{
                arr[k]=R[j];
                j++;
                k++;
            }
        }

        // In case of unequal arrays or biased traversing.

        // copying remaining elements(if any) from both subarrays:

        while(i<s1){
            arr[k]=L[i];
            k++;
            i++;
        }

        while(j<s2){
            arr[k]=R[j];
            k++;
            j++;
        }

    }

    public static void sort(int[] arr,int start,int end){
        if(start<end){

            int mid=(start+end)/2;

            sort(arr, start,mid);

            sort(arr,mid+1,end);

            merge(arr, start, mid, end);
        }
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	
        int arr[] ={2,1,-5,3,7,4};
        printArray(arr);
        sort(arr, 0, arr.length-1);
        printArray(arr);

    }
    
    
}
