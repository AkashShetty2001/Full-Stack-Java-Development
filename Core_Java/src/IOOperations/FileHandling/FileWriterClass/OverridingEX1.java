package IOOperations.FileHandling.FileWriterClass;
import java.io.*;
/*
 *  FileWriter:
   By using FileWriter object we can write character data to the file. 
   
Constructors:
 FileWriter fw=new FileWriter(String name);
 FileWriter fw=new FileWriter(File f);
 
    The above 2 constructors meant for overriding the data to the file
 */
public class OverridingEX1 {
	public static void main(String args[])throws IOException {
		
		 FileWriter fw=new FileWriter("a.txt",true);
		 fw.write(73);//char
		 fw.write("neuron\nTechnology\nPrivate\nLimited");
		 fw.write("\n");
		 char ch1[] ={'a','b','c'};
		 fw.write(ch1);
		 fw.write(74);
		 fw.flush();
		 fw.close();
		 
		 FileReader fr= new FileReader("a.txt");
		 File f=new File("a.txt");
		  char[] ch=new char[(int)f.length()];
		  System.out.println(fr.read(ch));
	
//			while(i != -1) {
//			System.out.print((char)i);
//			i=fr.read();
//			}
		  
		  fr.close();
			
		
		
	}

}
