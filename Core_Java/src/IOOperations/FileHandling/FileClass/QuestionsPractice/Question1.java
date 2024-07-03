package IOOperations.FileHandling.FileClass.QuestionsPractice;
import java.io.*;
/*
 *  ===========
 => Write code to create a file named with demo.txt in current working directory.
 */
public class Question1 {
	public static void main(String[] args) {
		File f= new File("demo.txt");
		try {
		f.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(f.exists());
	}

}
