package mock.exam.me.q45;

/*
 * Page: 559 (590 in pdf)
 * 
 * ME-Q45) Given the following code, what is the output? Select 1 option.
 * 
 * Correct answer: d
 */

// a - wrong
// Code fails compilation at line numbers 1, 3, 4, 7.

// b - wrong
// Code fails compilation at line numbers 6, 7.

// c - wrong
// Code fails compilation at line numbers 7, 9.

// d 
// Code fails compilation at line numbers 4, 5, 6, 7, 9.

// e - wrong
// No compilation error - outputs 500:300.

// f - wrong
// No compilation error - outputs 300:100.

// g- wrong
// Runtime exception.

public class Result {
	public static void main(String[] args) {
		// d
		// uncomment to see

		// Byte b1 = (byte) 100; // 1
		// Integer i1 = (int)200; // 2
		// Long l1 = (long)300; // 3
		// Float f1 = (float)b1 + (0int)11; // 4
		// String s1 = 300; // 5
		// if(s1 == (b1 + i1)) // 6
		// s1 = (String)500; // 7
		// else // 8
		// f1 = (int)100; // 9
		// System.out.println(s1 + ":" + f1); // 10
	}
}