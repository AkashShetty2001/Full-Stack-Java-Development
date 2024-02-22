package multiThreading.caseStudies;

class MyRunnabale1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread");
		
	}
}
public class Case2 {
	public static void main(String[] args) {
		MyRunnabale1 r= new MyRunnabale1();
		
		Thread t = new Thread();
		Thread t1 = new Thread(r);
		
		t1.start();//Thread class start method is called,it will invoke MyRunnable class run().
		//Thread 2 threads.
		
		System.out.println("Main Thread");
		
	}

	
	
	
	
}
