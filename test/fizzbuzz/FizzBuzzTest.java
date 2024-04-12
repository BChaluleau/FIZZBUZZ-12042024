package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fb;

	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void fizzBuzzUn() {
		assertEquals("1", fb.game(1));
	}

	@Test
	void fizzBuzzDeux() {
		assertEquals("2", fb.game(2));
	}

	@Test
	void fizzBuzzTrois() {
		assertEquals("fizz", fb.game(3));
	}

	@Test
	void fizzBuzzSomeNumbers() {
		assertEquals("4", fb.game(4));
		assertEquals("7", fb.game(7));
		assertEquals("8", fb.game(8));
		assertEquals("101", fb.game(101));

	}

	@Test
	void fizzBuzzCinq() {
		assertEquals("buzz", fb.game(5));
	}

	@Test
	void fizzBuzz3Multiples() {
		assertEquals("fizz", fb.game(6));
		assertEquals("fizz", fb.game(9));
		assertEquals("fizz", fb.game(12));
		assertEquals("fizz", fb.game(15));
		assertEquals("fizz", fb.game(300));
	}

	@Test
	void fizzBuzzCinqMultiples() {
		assertEquals("buzz", fb.game(10));
		assertEquals("buzz", fb.game(500));
	}
}
