package multiThreading.caseStudies;

class MyRunnabale3 implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread");
		
	}
}
public class Case3 {
	public static void main(String[] args) {
		MyRunnabale3 r= new MyRunnabale3();
		
		Thread t = new Thread();
		Thread t1 = new Thread(r);
		
		t.run();//only 1 thread , thread class run method called normally.
		
		System.out.println("Main Thread");
		
	}

	
	
	
	
}
