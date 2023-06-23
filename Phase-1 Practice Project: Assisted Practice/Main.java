package project2;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
public class Main {
	public static void main(String[] args) {
		try {
			throw new MyException("temp");
		}
		catch(MyException e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
		}
	}

}
