package IOOperations.FileHandling.FileClass.QuestionsPractice;
import java.io.*;
import java.util.Arrays;

/*
 * methods() of File class
 */
public class Question4 {
	public static void main(String[] args) {
		String location="D:\\Full Stack Java Development\\Full-Stack-Java-Development\\Core_Java";
		File f= new File(location);
		String names[]=f.list();
		int file=0;
		int dir=0;
		
		for(String name:names) {
			File f1= new File(f,name);
			if(f1.isFile()) {
				file++;
			}else {
				dir++;
			}
			System.out.println(name);
		}
		System.out.println("file couunt:"+file);
		System.out.println("directory couunt:"+dir);
		

	}

}
