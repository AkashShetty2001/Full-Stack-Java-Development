package multiThreading;
/*
 * Creation of Thread using runnable Interface.
 */

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}
public class Creation_Thread_Runnable {
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		//r.start(); no start in runnable Interface  ,exception
		
//		Thread t= new Thread();
//		t.start();//invoke thread class run() , no output
		
		
		/*
		 * Constructors
		 *  public java.lang.Thread();
  			public java.lang.Thread(java.lang.Runnable);
		 */
		Thread t= new Thread(r);
		t.start();
		
		System.out.println("Main Thread");
	}

}
