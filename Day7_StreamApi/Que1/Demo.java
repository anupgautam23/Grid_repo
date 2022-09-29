package Day7_StreamApi.Que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"p1",12,100));
		list.add(new Product(2,"p2",14,120));
		list.add(new Product(3,"p3",8,150));
		list.add(new Product(4,"p4",9,50));
		list.add(new Product(5,"p6",11,30));

	 List<Product> filteredList =	list.stream()
			 							.filter(p->p.getQuantity()>10)
			 							.sorted((p1,p2)->p2.getProductId()-p1.getProductId())
			 							.collect(Collectors.toList());
	 
//	 Collections.sort(filteredList,(p1,p2)-> p2.getProductName().compareTo(p1.getProductName()));
	 
				 for(Product p:filteredList) {
					 System.out.println(p);
				 }
		
		
	}
	
}
