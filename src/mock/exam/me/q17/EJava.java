package mock.exam.me.q17;

/*
 * Page: 547 (578 in pdf)
 * 
 * ME-Q16) Select the most appropriate definition of the variable name and the
 * line number on which it should be declared so that the following code
 * compiles successfully. (choose 1 option.)
 * 
 * Correct answer: a
 */

// a
// Define static String name; on line 1.

// b - wrong
// Define String name; on line 1.

// c - wrong
// Define String name; on line 2.

// d - wrong
// Define String name; on line 3.

class EJava {
	// LINE 1
	static String name;

	public EJava() {
		System.out.println(name);
	}

	void calc() {
		// LINE 2
		if (8 > 2) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// LINE 3
		System.out.println(name);
	}
}