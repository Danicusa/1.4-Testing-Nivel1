package level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1ex1.Library;

class CorrectBookPositionRecoverByTitleTest {

	@Test
	public void bookRecoverByPositionTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection("Pinocho", "Altamira");
		lib1.addNewBookToCollection("Don Quijote", "Altamira");
		lib1.addNewBookToCollection("El gato con botas", "Odisea");
	
		lib1.bookRecoverByPosition(0);
		
		assertEquals("Don Quijote", lib1.bookCollection.get(0).getTitle(), "The title of the book"
				+ " in the position 1 should be Don Quijote ");
	}
}
