package java01;

public class SqrtBinarySearch {
	
	static int prefectSqrt(int number) {
		//y^2<=x
		int start=0;
		int end=number;
		int current_ans=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			long current_value=mid*mid;
			if(current_value==number) {
				return mid;
			}
			else if(current_value<number) {
				start=mid+1;
				current_ans=mid;
			}
			else {
				end=mid-1;
			}
		}
		return current_ans;
		
		
	}

	public static void main(String[] args) {
		System.out.println(prefectSqrt(7));
		

	}

}
