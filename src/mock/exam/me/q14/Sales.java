package mock.exam.me.q14;

/*
 * Page: 546 (577 in pdf)
 * 
 * ME-Q14) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: c
 */

// a - wrong
// 5

// b - wrong
// 6

// c
// 8

// d - wrong
// 9

public class Sales {
	public static void main(String[] args) {
		int salesPhone = 1;
		System.out.println(salesPhone++ + ++salesPhone + ++salesPhone);
	}
}