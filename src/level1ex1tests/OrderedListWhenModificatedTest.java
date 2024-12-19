package level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import level1ex1.Book;
import level1ex1.Library;

class OrderedListWhenModificatedTest {

	@Test
	public void collectionRecoverTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection("Pinocho","Altamira");
		lib1.addNewBookToCollection("Don Quijote","Altamira");
		
		lib1.collectionRecover();
        assertTrue(isListSorted(lib1.bookCollection), "The book collection should be alphabetically ordered");
        
        
        assertEquals("Don Quijote".toLowerCase(), lib1.bookCollection.get(0).getTitle().toLowerCase());
		
	}
		private boolean isListSorted(List<Book> books) {
	        List<String> titles = new ArrayList<>();
	        for (Book book : books) {
	            titles.add(book.getTitle());
	        }

	        for (int i = 0; i < titles.size() - 1; i++) {
	            if (titles.get(i).compareTo(titles.get(i + 1)) > 0) {
	                return false;
	            }
	        }
	        return true;
	    
	}

}
