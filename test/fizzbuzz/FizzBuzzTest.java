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

}
