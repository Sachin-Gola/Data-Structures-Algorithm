package java01;

public class Permutations {

	public static void main(String[] args) {
		String str="abc";
		String str1="aba";
        permutation(str,"");
        System.out.println();
        uniquePermutations(str1, "");
        
	}
	
	public static void permutation(String str,String ans) {
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			permutation(str.substring(0,i)+str.substring(i+1), ans+str.charAt(i));
		}
		
	}
	
	public static void uniquePermutations(String str,String ans) {
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
		     if(isAvailable(str.substring(i+1), str.charAt(i))==false){
			      uniquePermutations(str.substring(0,i)+str.substring(i+1), ans+str.charAt(i));
		     }
		}
		
		
	}
	
	public static boolean isAvailable(String str,char ch) {
		if(str.isEmpty()) {
			return false;
		}
		if(str.charAt(0)==ch) return true;
		boolean remStr=isAvailable(str.substring(1), ch);
		return remStr;
	}

}
