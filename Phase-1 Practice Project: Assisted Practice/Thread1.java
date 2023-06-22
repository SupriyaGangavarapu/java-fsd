package project2;

public  class Thread1 implements Runnable{
	public static int mycount=0;
	public Thread1() {
		
	}
	public void run() {
		while(Thread1.mycount<=10) {
			try {
				System.out.println("Expl thread:"+(++Thread1.mycount));
				Thread.sleep(100);
			}catch(InterruptedException iex) {
				System.out.println("exception thread:"+iex.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting main thread...");
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		t.start();
		while(Thread1.mycount<=10) {
			try {
				System.out.println("Expl thread:"+(++Thread1.mycount));
				Thread.sleep(100);
			}catch(InterruptedException iex) {
				System.out.println("exception thread:"+iex.getMessage());
			}
		}
		System.out.println("end of main thread...");
	}
}