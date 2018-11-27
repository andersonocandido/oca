package mock.exam.me.q39;

/*
 * Page: 557 (588 in pdf)
 * 
 * ME-Q39) Which of the following code statements are correct? (Select 2
 * options.)
 * 
 * Correct answer: a and d
 */

// a
// StringBuilder sb1 = new StringBuilder() will create a StringBuilder object
// with no characters but with an initial capacity to store 16 characters.

// b - wrong
// StringBuilder sb2 = new StringBuilder(5*10) will create a StringBuilder
// object with a value of 50.

// c - wrong
// Unlike the class String, the concat method in StringBuilder modifies the
// value of a StringBuilder object.

// d
// The insert method can be used to insert a character, number or String at the
// start or end or a specified position of a StringBuilder.

class Result {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(5 * 10);
	}
}