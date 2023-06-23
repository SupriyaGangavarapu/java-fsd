package project2;

class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1=str2;
	}
	public String toString() {
		return("MyException Occurred:"+str1);
	}
}
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			System.out.println("String of try block");
			throw new MyException("This is my error message");
		}
		catch(MyException e) {
			System.out.println("catch block");
			System.out.println(e);
		}
	}
}
