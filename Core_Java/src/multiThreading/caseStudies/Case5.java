package multiThreading.caseStudies;

class MyRunnabale5 implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread");
		
	}
}
public class Case5 {
	public static void main(String[] args) {
		MyRunnabale5 r= new MyRunnabale5();
		
		Thread t = new Thread();
		Thread t1 = new Thread(r);
		
		//case5//
		//r.start();
		/* CTE no start() w r t to MyRunnable class.*/
		
		System.out.println("Main Thread");
		
	}

	
	
	
	
}
