package IOOperations.FileHandling.FileClass.QuestionsPractice;
import java.io.*;

/*
 *  Requirement
 => Write code to create a directory named with IPLTeam in current working directory
 and create a  file named with abc.txt in that directory.
 */
public class Question2 {
	public static void main(String[] args)throws IOException {
	File f= new File("Vijeth");
	f.mkdir();
	
	File f1= new File("Vijeth","grantley.txt");
	f1.createNewFile();
	System.out.println(f1.exists());
	System.out.println(f1.isFile());
		
	}

}
