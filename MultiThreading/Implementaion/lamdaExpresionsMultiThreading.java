package multiThreading;
/*
 * defining a thread using lambda expressions/
 */
public class lamdaExpresionsMultiThreading {
	public static void main(String[] args) {
		
		Runnable r = ()-> {
			// in the above statement i am referring to run method of implementation of runnable class. 
			for(int i=1;i<=5;i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		System.out.println(t);
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Main Thread");
	}

}
