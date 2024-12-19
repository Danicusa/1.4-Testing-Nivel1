package level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1ex1.Library;

class CorrectListModificationWhenRemovingTest {

	@Test
	public void deleteBookByTittleTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection("1984", "Secker & Warburg");
		lib1.addNewBookToCollection("El código Da Vinci", "Doubleday");
		assertEquals(2, lib1.bookCollection.size());
		
		lib1.deleteBookByTittle("1984");
		assertEquals(1, lib1.bookCollection.size());
	}
}
