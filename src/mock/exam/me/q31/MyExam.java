package mock.exam.me.q31;

class MyExam {
	/*
	 * Page: 552 (583 in pdf)
	 * 
	 * ME-Q31) What is the output of the following code? (Select 1 option.)
	 * 
	 * Correct answer: a
	 */

	// a
	// The code will print caught.

	// b - wrong
	// The code won't print caught.

	// c - wrong
	// The code would print caught if StackOverflowError were a runtime exception.

	// d - wrong
	// The code would print caught if StackOverflowError were a checked exception.

	// e - wrong
	// The code would print caught if question() throws the exception
	// NullPointerException.

	void question() {
		try {
			question();
		} catch (StackOverflowError e) {
			System.out.println("caught");
		}
	}

	public static void main(String[] args) {
		new MyExam().question();
	}
}