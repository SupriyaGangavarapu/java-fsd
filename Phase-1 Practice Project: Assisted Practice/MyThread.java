package project2;
public class MyThread extends Thread {
	public void run() {
		System.out.println("thread is activated");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();
	}

}
