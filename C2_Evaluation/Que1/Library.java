package C2_Evaluation.Que1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
	
	List<Book> bookList = new ArrayList<>();

	public void addBook(Book book) throws BookException{

		boolean res= bookList.stream().anyMatch(b->b.getIsbn()==book.getIsbn());
		if(res==true) {
			throw new BookException("Book already exist");
			
		}else {
			bookList.add(book);
			System.out.println("Book added successfully");
		}
		
	}
	
	public List viewAllBooks()throws BookException{
		
		List<Book> books= new ArrayList<>();
		if(bookList.isEmpty()) {
			throw new BookException("book list is empty");
		}else {
		 books= bookList.stream()
								  .sorted((b1,b2)->b1.getBookName().compareTo(b2.getBookName()))
								  .collect(Collectors.toList());
		}
		
		return books;
		
	}
	
	public List viewBooksByAuthor(String author)throws BookException{
		
		List<Book> b1 = new ArrayList<>();
		if(bookList.isEmpty()) {
			throw new BookException("No book found");
		}else {
		 bookList.forEach(b->{
			 
		 });
		}
			
			
		
		return b1 ;
		
	}
	
	public Book getBookByISBN(int isbn)throws BookException{
		Book  b2 ;
		if(bookList.isEmpty()){
			throw new BookException("No book found");
		}else {
		 b2=  bookList.get(isbn);
			
		}
	      
	      return b2;
		
	}
}
