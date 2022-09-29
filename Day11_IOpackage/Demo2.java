package Day11_IOpackage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		
		
		Path path = Paths.get("d://pfile.txt");
		Path path2 = Paths.get("d://pfile2.txt");
//		Files.createFile(path2);
		
		
		
//		List<String> resCity = Files.readAllLines(path);
		Stream<String> streamCity = Files.lines(path);
		
		List<String> list1 = streamCity.map(line->{
			if(line.contains("mumbai")) {
				return line.replace("mumbai", "welcome admin");
			}else {
				return line ; 
			}
		}).collect(Collectors.toList());
	    Files.write(path2,list1);
	    System.out.println("done");
	}

}
