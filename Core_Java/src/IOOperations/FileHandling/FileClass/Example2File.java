package IOOperations.FileHandling.FileClass;
import java.io.*;

/*
 * creating a directory
 */
public class Example2File {
	public static void main(String[] args) {
		File f1= new File("IPLTeams");
		System.out.println(f1.exists());
		
		//to create a directory i will make use of mkdir();
		f1.mkdir();
		System.out.println(f1.exists());
		
	}

}
