package tascas104level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tascas104level1ex1.Library;

public class CorrectListModificationWhenAddingTest {

	@Test
	public void addNewBookToCollectionTest() {
		Library lib1 = new Library();
		
		lib1.addNewBookToCollection();
		assertEquals(1, lib1.bookCollection.size());
		
		lib1.addNewBookToCollection();
		assertEquals(2, lib1.bookCollection.size());
	}

}
