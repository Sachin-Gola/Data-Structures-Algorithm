
import java.util.Scanner;

import java.util.Arrays;

public class ArraysQuestions {
	
	
	//printing array:
	static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	//Finding No of occurrence of a element in array.
	static int countOccurrence(int[] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) count++;
		}
		return count;	
	}
	
	
	
	//Find the occurrence of an element x in an given array:
	static int lastOccurrence(int[] arr,int x) {
		int lastIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) lastIndex=i;
		}
		return lastIndex;
    }
	
	
	
	//Count the number of elements strictly greater than value x.
	static int countGreater(int[] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) count++;
		}
		return count;	
	}
	
	
	
	//Check if the given array is sorted or not:
	static boolean isSorted(int []arr) {
		boolean check=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				check=false;  break;
			}
		}
		return check;
	}
	
	
	//return array with smallest and greatest element:
	static int[] smallestAndGreatest(int arr[]) {
		Arrays.sort(arr);
		int [] ans= {arr[0],arr[arr.length-1]};
		return ans;
	}
	
	
	//return Nth smallest and Nth largest element from an array:
	static int[] nthsmallestAndGreatest(int[] arr,int n) {
		Arrays.sort(arr);
		int ans[]= {arr[n-1],arr[arr.length-n]};
		return ans;
	}

	
	//main method:
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the element you want to find no of occurence of:");
		int d=sc.nextInt();
		int count=countOccurrence(arr,d);
		
		System.out.println("Frequency of "+d+" is : "+count);
		
		
		System.out.print("Enter the element you want to find last occurence of:");
		int l=sc.nextInt();
		int lastIndex=lastOccurrence(arr,l);
		if(lastIndex!=-1) System.out.println("Last index of "+l+" is "+lastIndex);
		else System.out.println("Element does not exist.");
		sc.close();
		
		System.out.println("This array is sorted : "+isSorted(arr));
		
		
		//2nd smallest and largest.
		int[] arr_2=nthsmallestAndGreatest(arr,2);
		System.out.println(arr_2[0]+" and "+arr_2[1]);
		
		
		
		//valid datatypes used in size of array.
		int my='A';
		char a=115;
		int[] arr2=new int['a'];
		System.out.println(my);
		System.out.println(arr2.length);
		System.out.println(a);
		

	
	
		
		
		//We can change the size of array but the stored data will get loss, hence
		//practically we cannot change the size of any array.
		int [] c={1,2,3,4,5};
		System.out.println(c.length);
		System.out.println(c);
		printArray(c);
		
		System.out.println();
		
		c=new int[4];
		System.out.println(c);//now c will refer to different base address.
		System.out.println(c.length);
		printArray(c);
		
		//null value in Array:
		int[][] arr_4=new int [5][];
		System.out.println(arr_4[0]);//It will return null.
		//System.out.println(arr_4[0][0]);   .It will give nullpointerexception.
		
		
		//anonymous array
		System.out.println(new int[]{2,5,6});//Will give reference of anonymous array.
		
		
		
		
		
		
	}

}
