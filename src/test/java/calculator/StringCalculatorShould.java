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
	
// 	Checking normal funtioning of fuction add
	@Test
	public void addtheNumbers() {
		assertEquals(999,Calculator.add("333,333,333"));
	}
	
	
	
//Allow the Add method to handle new lines between numbers (instead of commas) Allow \n as delimiter along-with comma
	@Test
	public void shouldAllowNewLineAsDelimiter() {
		assertEquals(6,Calculator.add("1\n2,3"));
	}
    
//	 Allowingstom delimiter by checking // in beginning of first line
	@Test
	public void shouldAllowCustomDelimiter() {
		assertEquals(3,Calculator.add("//;\n1;2"));
	}
	
//	 Custom Delimiter can be custom Regex Character
	@Test
	public void shouldAllowRegexCharAsCustomDelimiter() {
		assertEquals(3,Calculator.add("//.\n1.2"));
	}
	
//	 Throw exception for negative numbers
	@Test
	public void shouldThrowExceptionForNegativeNumbers() {
		try{
			Calculator.add("1,-2,3");
			fail("Exception expected");
		}catch(RuntimeException e) {
		}
	}
	
// Exception message should have negative number
	@Test
	public void shouldHaveNegativeNumbersInException() {
		try{
			Calculator.add("-1,-2,3");
			fail("Exception expected");
		}catch(RuntimeException e) {
			assertEquals("negatives not allowed: -1, -2",e.getMessage());
		}
	}
	
//Adding very large number....case will fail
	@Test
	public void addingVeryLargeNumber() {
		assertEquals(300000,Calculator.add("100000,100000,100000"));
	}
	
	
    
    
    
    
    
    
    
    
    
    
    
    
}
