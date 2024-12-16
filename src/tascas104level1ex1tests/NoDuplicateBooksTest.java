package tascas104level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tascas104level1ex1.Book;
import tascas104level1ex1.Library;

public class NoDuplicateBooksTest {

	@Test
	public void noDuplicateBooksTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection();
		lib1.addNewBookToCollection();
		lib1.addNewBookToCollection();
			
		assertEquals(2, lib1.bookCollection.size(),"The list should only have 2 books in it");
		
		assertEquals("Don Quijote", lib1.bookCollection.get(0).getTitle(),"The tittle of the"
				+ "book in the position 0 should be Don Quijote");
		assertEquals("Pinocho", lib1.bookCollection.get(1).getTitle(),"The tittle of the"
				+ "book in the position 0 should be Pinocho");
	}
}
