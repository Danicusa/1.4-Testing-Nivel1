package level1ex1tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1ex1.Library;

class NotNullListWhenCreatingLibraryTest {

	@Test
	public void listNotNullAfterLibraryCreationTest() {
		Library lib1 = new Library();
		
		assertNotNull(lib1.bookCollection, "The book collection should not be null.");
	}

}
