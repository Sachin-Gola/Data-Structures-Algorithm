package java01;
import  java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Initiating strings
		String name=new String("Sachin");//since string is a class
		String name_2="Kapil";           // name & name_2 are object.
		
		System.out.println(name);
		
	
		
		//using printf method:
		System.out.printf("%s",name_2);
		
		//taking string input from user:
		String st=sc.next();//takes only one word.
		String st1=sc.nextLine();//takes  a line.
		System.out.println(st1+ " "+st);
		
		
		
// ********useful string methods-- all the methods below are return type since strings are immutable.******
		
		
		//name.length()
		//name.toLowerCase()
		//name.toUpperCase()
		//name.trim() -- retrun a new string after removing all the leading and trailing whitespaces from string.
        System.out.println("    hello".trim());
        
        // name.substring(int start,[int end]) --  end_index is exclusive.
        // name.replace( to be replaced, replacer) --  eg. "Harry".replace('r','p')
        
        System.out.println(name.replace('i','o'));  // old-->new
        System.out.println(name.replace("sac","hal"));
        System.out.println(name.replace("o","gla"));
        
        
        // name.startsWith( subtring ) -- returns true or false.
        // name.endsWith( subtring ) -- returns true or false.
        // name.charAt( x ) --  returns character at index x.
        // name.indexOf(substring,[starting index ]) -- returns index of first occurence of substring in name.If not exists , return -1.
        // name.lastIndex ( substring , [before index]) -- returns index of last occurence of substring in name.If not exists , return -1.
        // name.equals( name2 ) -- compares values of name and name2.
        // name.equalsIgnoreCase(name2) -- ignores case while compairing.
        
        System.out.println("She said \'Hello\' to me.");
        sc.close();
        
		
	
		

	}

}
