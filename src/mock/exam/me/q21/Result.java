package mock.exam.me.q21;

/*
 * Page: 548 (579 in pdf)
 * 
 * ME-Q21) Assume that Oracle has asked you to create a method that returns the
 * concatenated value of two String objects. Which of the following methods can
 * accomplish this job? (Select 2 options.)
 * 
 * Correct answer: b and d
 */

// a - wrong
// public String add(String 1, String 2) {
// return str1 + str2;
// }

// b
// private String add(String s1, String s2) {
// return s1.concat(s2);
// }

// c - wrong
// protected String add(String value1, String value2) {
// return value2.append(value1);
// }

// d
// String subtract(String first, String second) {
// return first.concat(second.substring(0));
// }

class Result {
	// b
	private String add(String s1, String s2) {
		return s1.concat(s2);
	}

	// d
	String subtract(String first, String second) {
		return first.concat(second.substring(0));
	}
}