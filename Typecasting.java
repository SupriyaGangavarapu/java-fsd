package project1;
import java.util.Scanner;
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("the double value:");
		d=sc.nextDouble();
		int i=(int)d;
		System.out.println("Explicit Casting");
		System.out.println("the integer value: "+i);
		System.out.println("the integer value:");
		num=sc.nextInt();
		double D=(double)num;
		System.out.println("Implicit casting");
		System.out.println("the double value:"+D);
	}

}
