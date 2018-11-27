package mock.exam.me.q46;

/*
 * Page: 560 (591 in pdf)
 * 
 * ME-Q46) Given the following code, what is the output? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// 2050-12-12

// b
// 2072-02-01

// c - wrong
// 9999-09-09

// d - wrong
// Compilation error

// e - wrong
// Runtime exception

import java.time.LocalDate;

class Book {
	String ISBN;

	Book(String val) {
		ISBN = val;
	}

	public boolean equals(Object b) {
		if (b instanceof Book) {
			return ((Book) b).ISBN.equals(ISBN);
		} else {
			return false;
		}
	}
}

class TestEquals {
	public static void main(String[] args) {
		Book b1 = new Book("1234-4567");
		Book b2 = new Book("1234-4567");
		LocalDate release = null;
		release = b1.equals(b2) ? b1 == b2 ? LocalDate.of(2050, 12, 12) : LocalDate.parse("2072-02-01")
				: LocalDate.parse("9999-09-09");
		System.out.println(release);
	}
}