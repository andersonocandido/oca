package mock.exam.me.q12;

/*
 * Page: 545 (576 in pdf)
 * 
 * ME-Q12) Given the following code, which option, if used to replace / INSERT
 * CODE HERE /, will make the code print the value of the variable pagesPerMin?
 * (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// (LaserPrinter)myPrinter.pagesPerMin

// b - wrong
// myPrinter.pagesPerMin

// c - wrong
// LaserPrinter.myPrinter.pagesPerMin

// d
// ((LaserPrinter)myPrinter).pagesPerMin

class Printer {
	int inkLevel;
}

class LaserPrinter extends Printer {
	int pagesPerMin;

	public static void main(String[] args) {
		Printer myPrinter = new LaserPrinter();
		System.out.println(((LaserPrinter) myPrinter).pagesPerMin /* INSERT CODE HERE */);
	}
}