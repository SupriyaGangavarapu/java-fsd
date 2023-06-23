package project2;

public class ThrowsDemo {
	void Division() throws ArithmeticException{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("\nthe result is:"+rs);
	}
	public static void main(String[] args) {
	ThrowsDemo t=new ThrowsDemo();
	try {
		t.Division();
	}
	catch(ArithmeticException e) {
		System.out.println("\nError: "+e.getMessage());
	}
	System.out.println("\nEnd of the program");
	}

}
