package mock.exam.me.q57;

class Result {

	/*
	 * Page: 564 (595 in pdf)
	 * 
	 * ME-Q57) Which of the following code options are valid for defining
	 * multidimensional arrays? (Choose 4 options.)
	 * 
	 * Correct answer: a, b, c and d
	 */

	// a
	// String ejg1[][] = new String[1][2];

	// b
	// String ejg2[][] = new String[][] { {}, {} };

	// c
	// String ejg3[][] = new String[2][2];

	// d
	// String ejg4[][] = new String[][] { { null }, new String[] { "a", "b", "c" }, { new String() } };

	// e - wrong
	// String ejg5[][] = new String[][2];

	// f - wrong
	// String ejg6[][] = new String[][] { "A", "B" };

	// g - wrong
	// String ejg7[][] = new String[] { { "A" }, { "B" } };

	public static void main(String[] args) {

		// a
		String ejg1[][] = new String[1][2];

		// b
		String ejg2[][] = new String[][] { {}, {} };

		// c
		String ejg3[][] = new String[2][2];

		// d
		String ejg4[][] = new String[][] { { null }, new String[] { "a", "b", "c" }, { new String() } };
	}
}