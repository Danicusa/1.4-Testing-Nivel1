package tascas104level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tascas104level1ex1.Library;

class ListLengthIsCorrectTest {

	@Test
	public void correctLengthAfterAddingBooksTest() {
		
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection();
		lib1.addNewBookToCollection();
		lib1.addNewBookToCollection();
		
		assertEquals(3, lib1.bookCollection.size(), "The book collection size should be 3");
	}
}
