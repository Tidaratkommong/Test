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
	@Test
	void test2_input2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(2);
		assertEquals(2, input);
		
	}
	@Test
	void test3_input3() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.fizzBuzz(3);
		assertEquals("Fizz", input);
		
	}
	@Test
	void test4_input4() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(4);
		assertEquals(4, input);
		
	}
	@Test
	void test5_input5() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.fizzBuzz(5);
		assertEquals("Buzz", input);
		
	}
	@Test
	void test6_input6() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.fizzBuzz(6);
		assertEquals("Fizz", input);
		
	}
	@Test
	void test7_input7() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(7);
		assertEquals(7, input);
		
	}
	@Test
	void test8_input8() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(8);
		assertEquals(8, input);
		
	}
	@Test
	void test9_input9() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.fizzBuzz(9);
		assertEquals("Fizz", input);
		
	}
	@Test
	void test10_input10() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.fizzBuzz(10);
		assertEquals("Buzz", input);
		
	}
	@Test
	void test11_input11() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(11);
		assertEquals(11, input);
		
	}
	@Test
	void test12_input12() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.fizzBuzz(12);
		assertEquals("Fizz", input);
		
	}
	@Test
	void test13_input13() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(13);
		assertEquals(13, input);
		
	}

}

