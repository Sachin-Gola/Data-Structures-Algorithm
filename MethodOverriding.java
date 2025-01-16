

class A{
	public void meth1() {
		System.out.println("I am meth1 of class A.");
	}
	public void meth2() {
		System.out.println("I am meth2 of class A.");
	}
}


class B extends A{
	
	@Overrides
	
	// class B is child of A . Re-Implementation of meth1() in child class ( meth1()   having same signature in both class.
	// redefining method of superclass, in subclass.
	// return type (or subtype)of overrided method should be same in both classes.
	// cannot override final or static method.
	public void meth1() {
		System.out.println("I am meth1 of class B.");
	}
	
}
public class MethodOverriding {
	public static void main(String[] args) {
	
	}
         
}
