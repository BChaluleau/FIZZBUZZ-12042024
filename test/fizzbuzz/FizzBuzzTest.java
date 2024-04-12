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
		assertEquals("101", fb.game(101));

	}

}
