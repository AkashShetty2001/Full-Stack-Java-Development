package IOOperations.FileHandling.FileClass;
import java.io.File;
import java.io.IOException;


/*
 * creating a file using creayeNewFile();
 */
public class Example1File {
	public static void main(String args[])throws IOException {
		File f= new File("a.txt");
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
		
	}

}
