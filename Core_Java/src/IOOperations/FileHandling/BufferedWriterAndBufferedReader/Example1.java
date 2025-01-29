package IOOperations.FileHandling.BufferedWriterAndBufferedReader;
import java.io.*;

public class Example1 {
	public static void main(String[] args) throws IOException{
		
//		FileWriter fw= new FileWriter("a1.txt");
//		BufferedWriter bw=new BufferedWriter(fw);
//		
//		bw.write(105);
//		bw.write("Neuron");
//		
//		bw.newLine();
//		
//		char ch[]= {'p','w','s','k','i','l','l','s'};
//		bw.write(ch);
//		
//		bw.newLine();
//		
//		bw.write("unicorns");
//		bw.flush();
//		bw.close();
		
		
		FileReader fr= new FileReader("a1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
