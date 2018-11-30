package mock.exam.me.q66;

/*
 * Page: 568 (599 in pdf)
 * 
 * ME-Q66) Given the following code, which option, if used to replace / INSERT
 * CODE HERE /, will cause the code to print 110? (Select 1 option.)
 * 
 * Correct answer: e
 */

// a - wrong
// return super.pages + this.interviews * 5;

// b
// return this.pages + this.interviews * 5;

// c - wrong
// return super.pages + interviews * 5;

// d
// return pages + this.interviews * 5;

// e
// None of the above

class Book {
	private int pages = 100;
}

class Magazine extends Book {
	private int interviews = 2;

	private int totalPages() {
		/* INSERT CODE HERE */
		return 0; // replace the line to see
	}

	public static void main(String[] args) {
		System.out.println(new Magazine().totalPages());
	}
}