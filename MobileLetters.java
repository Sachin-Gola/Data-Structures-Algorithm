

import java.util.ArrayList;




public class MobileLetters {

	public static void main(String[] args) {
		String[] key= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		System.out.println(letterCombo(key, "23",""));          
		
		
	}
	
	public static ArrayList<String> letterCombo(String[] keys,String digits,String ans){
		
		ArrayList<String> list =new ArrayList<String>();
		if(digits.isEmpty()) {
			list.add(ans);
			return list;
		}
		
		
		
		
		int cn=(int)digits.charAt(0)-48;  //current digit/button
		String button=keys[cn];           //letters at current button
		for(int i=0;i<button.length();i++) {
			list.addAll(letterCombo(keys,digits.substring(1),ans+button.charAt(i)));
		}
		
		return list;
		
	}

}
