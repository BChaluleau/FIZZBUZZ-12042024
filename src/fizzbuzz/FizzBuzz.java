package fizzbuzz;

public class FizzBuzz {

	private int[] MAGIC_NUMBERS = { 3, 5 };
	private String[] MAGIC_VALUES = { "fizz", "buzz" };

	public String game(int turn) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < MAGIC_NUMBERS.length; i++) {
			if (turn % MAGIC_NUMBERS[i] == 0)
				sb.append(MAGIC_VALUES[i]);
		}
		if (!sb.isEmpty())
			return sb.toString();

		return String.format("%d", turn);
	}

}
