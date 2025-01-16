

class Arrays{
	void demoArrays(){
		int ages[]=new int[3];
//		float weights[]=new float[3];
//		String names[]=new String[3];	
		ages[0]=52;
		System.out.println(ages[0]);
		
	}
	
	
	//finding maximum value of array
	void maxOfArray(){
		int arr[]= {1,5,8,10,9,0};
		int max=0;
	    for (int i=0;i<arr.length;i++) {
	    	if(max<arr[i]) max=arr[i];
	    	else continue;
	    	}
	    System.out.println(max);
	}
	
	
	
	
}
public class ArraysExample{
	public static void main(String[] args) {
		
		Arrays obj= new Arrays();
		obj.demoArrays();
		obj.maxOfArray();
		
         
	}

}
