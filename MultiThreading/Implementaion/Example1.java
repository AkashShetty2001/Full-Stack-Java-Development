class MyThread extends Thread{
  @Override
public void run(){
 for( int i=0;i<=10;i++){
	 System.out.println("Child Thread");
         }
}


}

public class Example1{
public static void main(String args[]){
	 MyThread t = new MyThread();
	 t.start();

	 for( int i=0;i<=10;i++){
	 System.out.println("Main Thread");
         }
	}
}