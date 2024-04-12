package fizzbuzz;

public class FizzBuzz {

	private int MAGIC_NUMBER = 3;
	private String MAGIC_VALUE = "fizz";

	public String game(int turn) {
		if (turn == MAGIC_NUMBER) {
			return MAGIC_VALUE;
		}
		return String.format("%d", turn);
	}

}
