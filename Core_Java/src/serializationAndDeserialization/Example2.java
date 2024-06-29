package serializationAndDeserialization;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example2 {
	public static void main(String[] args) throws Exception {
		
		Dog d1= new Dog();
		
		
		System.out.println("Serialization process started");
		File filename= new File("abc.ser");
		FileOutputStream fos= new FileOutputStream(filename);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		/* to write object data*
		 * oos.writeObject();
		 */
		
		oos.writeObject(d1);
		System.out.println("Serialization Object reference is:"+d1);
		System.out.println("serialization ended");
		
		
		System.in.read();
		
		System.out.println("Deserialization started");
		File file= new File("abc.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog d2=(Dog)ois.readObject();
		System.out.println("DeSerialization Object reference is:"+d2);
		System.out.println("Deserialization ended");
		
		System.out.println(d2.i);
		System.out.println(d2.j);
		
		
	}

}

class Dog implements Serializable{
	 transient int i=10;
	int j=20;
	
	static {
		System.out.println("Inside Static block");
	}
	
	public Dog() {
		System.out.println("Inside a Constructor");
	}
	
	
}
