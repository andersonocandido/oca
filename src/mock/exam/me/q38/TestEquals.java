package mock.exam.me.q38;

/*
 * Page: 556 (587 in pdf)
 * 
 * ME-Q38) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// true:false

// b - wrong
// true:true

// c - wrong
// false:true

// d
// false:false

// e - wrong
// Compilation error - there is no equals method in the class Book.

// f - wrong
// Runtime exception.

class Book {
	String ISBN;

	Book(String val) {
		ISBN = val;
	}
}

class TestEquals {
	public static void main(String... args) {
		Book b1 = new Book("1234-4567");
		Book b2 = new Book("1234-4567");
		System.out.print(b1.equals(b2) + ":");
		System.out.print(b1 == b2);
	}
}