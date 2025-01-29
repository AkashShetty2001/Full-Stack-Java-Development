package IOOperations.FileHandling.BufferedWriterAndBufferedReader;
import java.io.*;

public class ExamplePrinteWrieter1 {
	public static void main(String[] args)throws IOException {
		
		FileWriter fw = new FileWriter("a2.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(100);
		pw.println(100.00d);
		pw.println(100.00f);
		pw.println(100l);
		pw.println(true);
		pw.println('c');
		pw.println("String value");
		
		pw.flush();
		pw.close();
		
		
		
	}

}
