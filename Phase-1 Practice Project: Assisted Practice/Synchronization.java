
package project2;
import java.io.*;
import java.util.*;
class Sender {
	public void send(String msg) {
		System.out.println("sending\t"+msg);

	try {
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println("thread interrupted");
	}
	System.out.println("\n"+msg+" sent");
	}
}
class Threadsend extends Thread{
	private String msg;
	private Thread t;
	Sender sender;
	Threadsend(String m,Sender obj){
		msg=m;
		sender=obj;
	}
	public void run() {
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
}
class Synchronization{
public static void main(String args[]) {
		Sender snd=new Sender();
		Threadsend s1= new Threadsend("hi",snd);
		Threadsend s2=new Threadsend("bye",snd);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		}
		catch(Exception e) {
			System.out.println("interrupted");
		}
	}
}