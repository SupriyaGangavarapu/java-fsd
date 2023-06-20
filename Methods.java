package project1;

class Myclass{
	public void method1() {
		System.out.println("This is a method without arguments");
	}
	public void method2(int a,double d) {
		System.out.println("This is a method with arguments");
		double sum= a+d;
		System.out.println("sum: "+sum);
	}
	public int method3() {
		System.out.println("method with return value");
		return 7;
	}
	public void method4(int num1, int num2) {
		System.out.println("method with argument and with return");
		int mul=num1*num2;
		System.out.println("multiplication: "+mul);
		return ;
	}
}
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass obj=new Myclass();
		obj.method1();
		obj.method2(3, 7.1);
		obj.method3();
		obj.method4(3, 7);
	}

}