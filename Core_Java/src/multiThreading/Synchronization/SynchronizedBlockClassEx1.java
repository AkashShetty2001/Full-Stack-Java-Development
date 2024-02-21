package multiThreading.Synchronization;

class Display1{
	public void wish(String name) {
		;;;;;;;;;;;;// Lines of code(accessible by multiple threads).
		
		//critical Section
		synchronized(Display1.class) { // class level Lock
			System.out.println("The Thread which accquired the lock :"+Thread.currentThread().getName());
			for(int i=0;i<=4;i++) {
				System.out.println("Hello:"+ name);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("The Thread which releases the lock :"+Thread.currentThread().getName());
		}
		
		;;;;;;;;;;;;;;;;;;;;;;;;// Lines of code(accessible by multiple threads).
	}
}

class MyThread4 extends Thread{
	Display1 d;
	String name;
	
	MyThread4(Display1 d,String name){
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedBlockClassEx1 {
	public static void main(String[] args) {
		
		Display1 d = new Display1();
		
		MyThread4 t1= new MyThread4(d,"Akash");
		MyThread4 t2= new MyThread4(d,"Ravi");
		
		t1.setName("Thread-Akash");
		t2.setName("Thread-Ravi");
		t1.start();
		t2.start();

		
	}

}
