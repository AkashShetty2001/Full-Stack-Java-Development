package multiThreading;

class MyThread extends Thread {
	@Override
	public void run() {
	for (int i=0;i<=10;i++) {
		System.out.println("child thread");
	}
	}


	}

	public class Define_a_Thread{
	public static void main(String args[]){
		 MyThread t = new MyThread();
		 t.start();
		 
		 // after the above line there are two threads

		 for( int i=0;i<=10;i++){
		 System.out.println("Main Thread");
	         }
		}
	}