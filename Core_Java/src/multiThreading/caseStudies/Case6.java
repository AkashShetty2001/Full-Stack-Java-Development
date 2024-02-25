package multiThreading.caseStudies;

class MyRunnabale6 implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread");
		
	}
}
public class Case6 {
	public static void main(String[] args) {
		MyRunnabale6 r= new MyRunnabale6();
		
		Thread t = new Thread();
		Thread t1 = new Thread(r);
		
		r.run();//
		/*no  new  thread , my using r MyRunnable class run() is called.
		 * only main thread is used, and it will call the MyRunnabale6 run() */
		
		System.out.println("Main Thread");
		
	}

	
	
	
	
}
