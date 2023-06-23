package project2;

public class FinallyDemo {
	public static void main(String[] args) {
		int a=45,b=0,rs=0;
		try {
		rs=a/b;
		}
		catch(ArithmeticException e) {
		System.out.println("\nError: "+e.getMessage());
		}
		finally {
			System.out.println("\nThe result is:"+rs);
		}
	}

}
