package IOOperations.FileHandling.FileClass;
import java.io.*;
/*
 *  File class constructors
 ==================
 1. File f=new File(String name); 
    => Creates a java File object that represents name of the file or directory in 
current working directory.
 eg#1. File f=new File("abc.txt");
 2. File f=new File(String subdirname,String name);
    => Creates a File object that represents name of the file or directory present 
in specified sub directory.
 eg#1. File f1=new File("abc");
 f1.mkdir();
   File f2=new File("abc","demo.txt");
 3. File f=new File(File subdir,String name);
 eg#1.File f1=new File("abc");
  f1.mkdir();
          File f2=new File(f1,"demo.txt");
 */
public class Example3File {
	public static void main(String[] args)throws IOException {
		// 1. File f=new File(String name); 
		
		//2.2. File f=new File(String subdirname,String name);
		File f2= new File("KKR");
		f2.mkdir();
		File f3= new File("KKR","Players.txt");
		f3.createNewFile();
		System.out.println(f3.exists());
		
		 //File f=new File(File subdir,String name)
		
		File f4= new File(f2,"Players.txt");
		f4.createNewFile();
		System.out.println(f4.exists());
		
		
	}

}
