package level1ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayExceptionExampleTest {

	 @Test
	    void testArrayIndexOutOfBoundsException() {
		 
		 ArrayExceptionExample example = new ArrayExceptionExample();

	        int[] testArray = {1, 2, 3, 4, 5};

	        ArrayIndexOutOfBoundsException thrown = assertThrows(
	            ArrayIndexOutOfBoundsException.class,
	            () -> example.getElementAtIndex(testArray, 10),
	            "Expected ArrayIndexOutOfBoundsException to be thrown"
	        );

	        assertEquals("Index 10 out of bounds for length 5", thrown.getMessage());
	    }
	 }
