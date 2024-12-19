package level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1ex1.Library;

public class CorrectListModificationWhenAddingTest {

	@Test
	public void addNewBookToCollectionTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection("El nombre del viento","Ro");
		assertEquals(1, lib1.bookCollection.size());
		
		lib1.addNewBookToCollection("El señor de los anillos", "George Allen & Unwin");
		assertEquals(2, lib1.bookCollection.size());
	}

}
