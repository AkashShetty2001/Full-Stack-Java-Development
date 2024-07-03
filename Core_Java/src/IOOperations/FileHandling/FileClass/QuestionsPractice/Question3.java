package IOOperations.FileHandling.FileClass.QuestionsPractice;
import java.io.*;
/*
 *  Requirement: Write code to create a file named with rcb.txt present in c:\IPLTeam 
folder.
 */
//Core_Java/src/IOOperations/FileHandling/FileClass/QuestionsPractice
public class Question3 {
	public static void main(String args[]) throws IOException{
		File F= new File("D:\\Full Stack Java Development\\Full-Stack-Java-Development\\Core_Java\\KKR","staff.txt");
		F.createNewFile();
		System.out.println(F.exists());
	}

}
