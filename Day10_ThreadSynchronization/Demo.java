package Day10_ThreadSynchronization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {
	
	
	public static void main(String[] args) throws IOException  {
		
		PrintWriter out = new PrintWriter("d://abc.txt");
		
		out.write(100);
		out.println(100);
		out.println(false);
		out.println('c');
		out.println("amit");
		
		out.close();
		System.out.println("done");
	}
}
