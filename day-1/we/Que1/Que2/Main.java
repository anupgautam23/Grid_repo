package Day1_HashMap.Assignment.Que2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue<Product> q  =  new PriorityQueue<>(new ProductSortByPrice());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of product you want to add");
		int n  = scanner.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			Scanner scanner2 =  new Scanner(System.in);
			System.out.println("Enter product Id ");
			int id = scanner2.nextInt();
			System.out.println("Enter product name ");
			String name  = scanner2.next();
			System.out.println("Enter product price ");
			int price = scanner2.nextInt();
//			Product product=  new Product(id, name, price);
			Product product =  new Product();
		    product.setProductId(id);
		    product.setProductName(name);
		    product.setProductPrice(price);
	
		    q.offer(product);
		}
//		System.out.println(q);
		Iterator<Product> p1 =  q.iterator();
		
		while(p1.hasNext()) {
			Product product= p1.next();
			System.out.println(product);
		}
		
		
		
		
		

	}

}
