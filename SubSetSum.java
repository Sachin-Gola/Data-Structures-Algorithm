package java01;

public class SubSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,5,4,8,3};
		int target=11;
		int count=subSet(arr,target,0,0);
		System.out.println(count);
		

	}
	
	private static int subSet(int[] arr,int target,int idx,int sum) {
		int count=0;
		if(idx>=arr.length) {
			if(sum==target) {
				count+=1;
				//ArraysQuestions.printArray(arr);
//				System.out.print("  ");s
			}
			return count;
			
		}
		
		int count1=subSet(arr, target, idx+1, sum+arr[idx]);
		int count2=subSet(arr, target, idx+1, sum);
		
		return count1+count2;
		
		
		
	}

}
