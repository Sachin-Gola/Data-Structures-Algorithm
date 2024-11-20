package java01;

public class MethodOverloading {
	// contructors overloading:
	MethodOverloading(){
		System.out.println(" I am constructor.");
	}
	MethodOverloading(int x){
		System.out.println(" I am overlaoded constructor with value: "+x);
	}
	
	

	
	
	
	static void tellJoke() {
		// It can be use within the class without creating any object of the class.
		System.out.println("Joke");
		
	}
	
	
	
	
	// Method overloading
	// same name but  different parameters list. Overall the signature is different.
	// return must be same for all overloaded methods.
		static void foo() {
			System.out.println("foo hello");
		}
		static void foo(int a) {
			System.out.println("Namaskar.");
		}


    // main method :
	public static void main(String[] args) {
		tellJoke(); // as said in line 5.
		foo();
		foo(3);

	} 
	

	
	
}
