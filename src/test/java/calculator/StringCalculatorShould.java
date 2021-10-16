package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
 // for single string it will return same string
 	@Test
 	public void shouldReturnNumberOnSingleString() {
 		assertEquals(1, Calculator.add("1"));
 	}
 	
 //  for two strings separated by commas it will return sum of the two
 	@Test
 	public void shouldReturnSumOfNumbersOnTwoStrings() {
 		assertEquals(3, Calculator.add("1,2"));
 	}
    
//	 for multiple strings separated by commas it will return sum of all
	@Test
	public void shouldReturnSumOfAllNumbers() {
		assertEquals(6,Calculator.add("1,2,3"));
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
