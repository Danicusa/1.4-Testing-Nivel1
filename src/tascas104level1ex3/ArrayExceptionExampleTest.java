package tascas104level1ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayExceptionExampleTest {

	 @Test
	    void testArrayIndexOutOfBoundsException() {
		 
	        ArrayExceptionExample example = new ArrayExceptionExample();
	        
	        int[] testArray = {1, 2, 3, 4, 5};

	        try {
	            example.getElementAtIndex(testArray, 10);

	            fail(" ArrayIndexOutOfBoundsException was excepted");
	        } catch (ArrayIndexOutOfBoundsException e) {
	        		System.out.println(e.getMessage());
	        }
	 }
}