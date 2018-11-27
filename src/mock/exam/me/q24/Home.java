package mock.exam.me.q24;

/*
 * Page: 550 (581 in pdf)
 * 
 * ME-Q24) Given the following, which options, when inserted at // INSERT
 * CONSTRUCTOR HERE, will define valid overloaded constructors for the classe
 * Home? (Choose 3 options.)
 * 
 * Correct answer: a, c and e
 */

// a
// Home() {
// }

// b - wrong
// Float Home() {
// }

// c
// protected Home(int rooms) {
// }

// d - wrong
// final Home() {
// }

// e
// private Home(long name) {
// }

// f - wrong
// Float Home(int rooms, String name) {
// }

// g - wrong
// static Home() {
// }

final class Home {
	String name;
	int rooms;
	// INSERT CONTRUCTOR HERRE

	// a
	Home() {
	}

	// c
	protected Home(int rooms) {
	}

	// e
	private Home(long name) {
	}
}