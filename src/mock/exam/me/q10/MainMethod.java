package mock.exam.me.q10;

/*
 * Page: 544 (575 in pdf)
 * 
 * ME-Q10) Given the following code, what is its output if it's executed using
 * the following command? (Select 1 option.)
 * 
 * java MainMethod 1+2 2*3 4-3 5+1
 * 
 * Correct answer: h
 */

// a - wrong
// java:1+2

// b - wrong
// java:3

// c - wrong
// MainMethod:2*3

// d - wrong
// MainMethod:6

// e - wrong
// 1+2:2*3

// f - wrong
// 3:3

// g - wrong
// 6

// h
// 1+2:4-3

// i - wrong
// 31

// j - wrong
// 4

public class MainMethod {
	public static void main(String... args) {
		System.out.println(args[0] + ":" + args[2]);
	}
}