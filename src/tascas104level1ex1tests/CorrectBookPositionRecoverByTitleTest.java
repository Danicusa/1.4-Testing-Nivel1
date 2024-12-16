package tascas104level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tascas104level1ex1.Library;

class CorrectBookPositionRecoverByTitleTest {

	@Test
	public void bookRecoverByPositionTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection();
		lib1.addNewBookToCollection();
	
		lib1.bookRecoverByPosition(1);
		
		assertEquals("Don Quijote", lib1.bookCollection.get(1).getTitle(), "The title of the book"
				+ " in the position 1 should be Don Quijote ");
	}
}
