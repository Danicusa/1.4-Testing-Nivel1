package level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1ex1.Library;

class ListLengthIsCorrectTest {

	@Test
	public void correctLengthAfterAddingBooksTest() {
		
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection("Pinocho", "Altamira");
		lib1.addNewBookToCollection("Don Quijote", "Altamira");
		lib1.addNewBookToCollection("El código Da Vinci", "Doubleday");
		
		assertEquals(3, lib1.bookCollection.size(), "The book collection size should be 3");
	}
}
