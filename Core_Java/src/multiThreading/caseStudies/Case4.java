package multiThreading.caseStudies;

class MyRunnabale4 implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread");
		
	}
}
public class Case4 {
	public static void main(String[] args) {
		MyRunnabale4 r= new MyRunnabale4();
		
		Thread t = new Thread();
		Thread t1 = new Thread(r);
		
		t1.run();//only 1 thread, runnable run method is called normally.
		
		System.out.println("Main Thread");
		
	}

	
	
	
	
}
