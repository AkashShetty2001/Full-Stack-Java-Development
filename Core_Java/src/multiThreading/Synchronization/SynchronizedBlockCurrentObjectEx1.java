package multiThreading.Synchronization;

class Displayy{
	public void wish(String name) {
		;;;;;;;;;;;;// Lines of code(accessible by multiple threads).
		
		//critical Section
		synchronized(this) { // current Object
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

class MyThread3 extends Thread{
	Displayy d;
	String name;
	
	MyThread3(Displayy d,String name){
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedBlockCurrentObjectEx1 {
	public static void main(String[] args) {
		
		Displayy d = new Displayy();
		
		MyThread3 t1= new MyThread3(d,"Akash");
		MyThread3 t2= new MyThread3(d,"Ravi");
		
		t1.setName("Thread-Akash");
		t2.setName("Thread-Ravi");
		t1.start();
		t2.start();

		
	}

}
