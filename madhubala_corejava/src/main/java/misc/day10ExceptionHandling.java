package misc;

class Divider {

	public static int divisor(int i, int j) throws Exception {
		if (i == 0 || j == 0) {

			throw new Exception("thw number should not be zero");

		}
		return i / j;

	}

}

public class day10ExceptionHandling {

	public static void main(String[] args) {

		try {
			Divider.divisor(5, 0);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
