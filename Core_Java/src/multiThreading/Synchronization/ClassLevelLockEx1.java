package multiThreading.Synchronization;

class Disp{
	
	public static synchronized void displayNumbers() {
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
	
	public static synchronized void displayCharacters() {
		for(int i=65;i<=75;i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	Disp d;
	
	MyThread1(Disp d){
		this.d=d;
	}
	
	@Override
	public void run() {
		d.displayNumbers();
	}
}

class MyThread2 extends Thread{
	Disp d;
	
	MyThread2(Disp d){
		this.d=d;
	}
	
	@Override
	public void run() {
		d.displayCharacters();
	}
}
public class ClassLevelLockEx1 {
	
	public static void main(String[] args) {
		 Disp d= new Disp();
		 
		 MyThread1 t1= new MyThread1(d);
		 MyThread2 t2= new MyThread2(d);
		 
		 t1.start();
		 t2.start();
	}

}
