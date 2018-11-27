package mock.exam.me.q47;

/*
 * Page: 560 (591 in pdf)
 * 
 * ME-Q47) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// 11
// 13
// 15
// 17
// 19

// b
// 20

// c - wrong
// 11
// 14
// 17
// 20

// d - wrong
// 40

// e - wrong
// Compilation error

class Result {
	public static void main(String[] args) {
		int a = 10;
		for (; a <= 20; ++a) {
			if (a % 3 == 0)
				a++;
			else if (a % 2 == 0)
				a = a * 2;
			System.out.println(a);
		}
	}
}