package project2;

public class ThrowDemo {

	public static void main(String[] args) {
		int a=10,b=5,rs;
		try {
			if(b==0)
				throw(new ArithmeticException("can't devided by zero"));
			else {
				rs=a/b;
				System.out.println("\nthe result is:"+rs);
			}
		}
		catch(ArithmeticException Ex) {
			System.out.println("\nerror:"+Ex.getMessage());
		}
		System.out.println("\nend the program");
	}

}
