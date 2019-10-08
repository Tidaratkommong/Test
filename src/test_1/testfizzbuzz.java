package test_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void test1_input1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(1);
		assertEquals(1, input);
		
	}
}

