package multiThreading.Synchronization;


class Display{
	public synchronized void wish(String name) {
		for(int i=1;i<=5;i++) {
			System.out.print("Good morning!");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread{
	 
	Display d;//Has A Relationship
	String name;// Instance Variable
	
	//constructor
	public MyThread(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	
	//define a job for Thread
	@Override
	public void run() {
		System.out.println("Child Thread");
		d.wish(name);
	}
}
public class ObjectLockEx1 {
	public static void main(String[] args) {
		
		Display d= new Display();
		MyThread t1= new MyThread(d,"Dhoni");
		MyThread t2= new MyThread(d,"Yuvi");
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread");
	}

}
