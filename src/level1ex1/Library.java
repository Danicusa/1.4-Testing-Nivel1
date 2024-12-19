package level1ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Library {
	public static Scanner sc = new Scanner(System.in);
	public List<Book> bookCollection;
	
	public Library() {
		bookCollection = new ArrayList<Book>();
	}
	
	public void addNewBookToCollection(String title, String editorial ) {
		Book book1 = new Book(title, editorial);
		
	    if (!this.bookCollection.contains(book1)) {
	        this.bookCollection.add(book1);
	    }
	    
	   //Collections.sort(this.bookCollection, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
	   Collections.sort(this.bookCollection, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

	}
	
	/*public Book newBook() {
		String title = "";
		String editorial = "";
		int isbn = 0;
		
		System.out.println("Enter the book name");
		title = sc.nextLine();
		System.out.println("Enter the book editorial");
		editorial = sc.nextLine();
		
		Book book1 = new Book(title, editorial);
		
		return book1;*/
	
	
	public void collectionRecover() {
	    for (Book book : this.bookCollection) {
	        System.out.println(book.toString() + "\n");
	    }
	}

	public void bookRecoverByPosition(int position) {
		
		System.out.println(bookCollection.get(position).toString());
	}
	
	public void addBookToAPosition(int position, String title, String editorial) {
		
		Book book1 = new Book(title, editorial);
		
		bookCollection.add(position, book1);
	}
	
	public void deleteBookByTittle(String title) {	
		int index = -1;

		index = getBookIndex(title);
		
		if(index > -1) {
			bookCollection.remove(index);
		}
	}
	
	public int getBookIndex(String title) {
		int index = -1;
		
		for(int i = 0;  i < bookCollection.size() && index == -1; i++) {
			if (title.equalsIgnoreCase(bookCollection.get(i).getTitle())) {
				index = i;
			}
		}
		
		return index;
	}
	
}
