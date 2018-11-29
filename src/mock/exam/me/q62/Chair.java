package mock.exam.me.q62;

/*
 * Page: 566 (597 in pdf)
 * 
 * ME-Q62) Given the following code, what is the output? Select 1 option).
 * 
 * Correct answer: e
 */

// a - wrong
// 111

// b - wrong
// 123

// c - wrong
// 222

// d - wrong
// 333

// e
// Compilation error

// f - wrong
// Runtime exception

interface Jumpable {
	int height = 1;

	default void worlRecord() {
		System.out.println(height);
	}
}

interface Movable {
	int height = 2;

	default void worlRecord() {
		System.out.println(height);
	}
}

// uncomment to see
// e

// class Chair implements Jumpable, Movable {
// int height = 2;
//
// Chair() {
// worlRecord();
// }
//
// public static void main(String[] args) {
// Jumpable j = new Chair();
// Movable m = new Chair();
// Chair c = new Chair();
// }
// }