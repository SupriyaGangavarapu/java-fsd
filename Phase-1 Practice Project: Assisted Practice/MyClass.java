package project2;

public class MyClass {
	private static Object LOCK=new Object();
	public static void main(String[] args)throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Thread:"+Thread.currentThread().getName()+"is woken after sleeping 1 sec");
		synchronized(LOCK){
			LOCK.wait(2000);
			System.out.println("object"+LOCK+"is woken after"+"waiting for 1 sec");
		}
	}
}
