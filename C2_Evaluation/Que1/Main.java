package C2_Evaluation.Que1;

import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class Main {

	public static void main(String[] args) throws Exception {
		int c= 0  ;
		 Library l1= new Library();
		while(c<=5) {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("1.Add Book\r\n"
				+ "2.Display all book details\r\n"
				+ "3.Search Book by author\r\n"
				+ "4.Search book by ISBN\r\n"
				+ "5.Exit");
		System.out.print("enter choice: ");
		  c = scanner2.nextInt();
		  
		 
		  if(c==1) {
			    System.out.print("Enter the isbn no: ");
				int isbn  = scanner2.nextInt();
				System.out.print("Enter the book name: ");
				String name =scanner2.next();
				System.out.print("Enter the author name:");
				String  author = scanner2.next();
				Book book = new Book(isbn, name, author);
				try {
					l1.addBook(book);
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				
		  }else if(c==2) {
			  List<Book> newBooks = l1.bookList;
			  System.out.println(newBooks);
		  }else if(c==3) {
			  try {
				 l1.viewBooksByAuthor("bruce");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		  }else if(c==4) {
			  try {
				  System.out.println("Enter ISBN Number");
			 int isbnNo = scanner2.nextInt();
			  Book b1 = l1.getBookByISBN(isbnNo);
			   System.out.println(b1);
			  }catch (BookException e) {
				System.out.println(e.getMessage());
			}
		  }
		
		c++ ;
		}
		System.out.println("Out Put Thank you !!");
		
	}
	

}
