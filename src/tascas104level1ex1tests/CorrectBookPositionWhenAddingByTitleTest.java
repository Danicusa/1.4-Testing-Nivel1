package tascas104level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tascas104level1ex1.Library;

public class CorrectBookPositionWhenAddingByTitleTest {

	@Test
	public void addBookToAPositionTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection();

		lib1.addBookToAPosition(0);
		
		assertEquals("Don Quijote", lib1.bookCollection.get(0).getTitle(), "The book with title"
				+ " Don Quijote should be in the position 0");
	}

}
