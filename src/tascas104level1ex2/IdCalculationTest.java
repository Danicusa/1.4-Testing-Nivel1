package tascas104level1ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IdCalculationTest {

	@ParameterizedTest
	@CsvSource({
		"12345678,Z", 
        "87654321,X",
        "11111111,H",
        "22222222,J",
        "33333333,P",
        "44444444,A",
        "55555555,K",
        "66666666,Q",
        "77777777,B",
        "88888888,Y"
    })
	void testIdLetterCalculation(String id, String expectedLetter) {
       
        IdCalculation idCalculation = new IdCalculation(id);

        String actualLetter = idCalculation.idLetter();
        
        assertEquals(expectedLetter, actualLetter);
    }
}
