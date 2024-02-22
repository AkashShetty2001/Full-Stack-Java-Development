package multiThreading.caseStudies;

class MyRunnabale implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread");
		
	}
}
public class Case1 {
	public static void main(String[] args) {
		MyRunnabale r= new MyRunnabale();
		
		Thread t = new Thread();
		Thread t1 = new Thread(r);
		
		t.start();// making a call to Thread class run() , there are currently 2 Threads.
		
		System.out.println("Main Thread");
		
	}

}
