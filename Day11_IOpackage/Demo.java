package Day11_IOpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws IOException  {
		
		Path path  = Paths.get("d://pFile2.txt");
		
		
		
		List<String >city = Files.readAllLines(path);
	
		System.out.println(city);
	}

}
