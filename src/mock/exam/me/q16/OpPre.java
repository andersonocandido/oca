package mock.exam.me.q16;

/*
 * Page: 546 (577 in pdf)
 * 
 * ME-Q16) Which the following options defines the correct structure of a Java
 * class that compiles successfully? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// 60

// b - wrong
// 59

// c - wrong
// 61

// d
// No output

// e - wrong
// The code fails to compile

class OpPre {
	public static void main(String... args) {
		int x = 10;
		int y = 20;
		int z = 30;
		if (x + y % z > (x + (-y) * (-z))) {
			System.out.println(x + y + z);
		}
	}
}