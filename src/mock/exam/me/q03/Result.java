package mock.exam.me.q03;

/*
 * Page: 540 (571 in pdf)
 * 
 * ME-Q3) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// 5

// b - wrong
// 6

// c - wrong
// 10

// d
// 11

// e - wrong
// 12

// f - wrong
// Compilation error

// g - wrong
// No output

// h - wrong
// Runtime exception

class Result {
	public static void main(String[] args) {
		int a = 10;
		String name = null;

		try {
			a = name.length(); // line1
			a++; // line2
		} catch (NullPointerException e) {
			a++;
			return;
		} catch (RuntimeException e) {
			a--;
			return;
		} finally {
			System.out.println(a);
		}
	}
}