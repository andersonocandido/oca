package mock.exam.me.q53;

/*
 * Page: 563 (594 in pdf)
 * 
 * ME-Q53) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: e
 */

// a - wrong
// in-built:false

// b - wrong
// in-built:true

// c - wrong
// null:false

// d - wrong
// null:true

// e
// Compilation error

class Phone {
	String keyboard = "in-built";
}

class Tablet extends Phone {
	boolean playMovie = false;
}

class College2 {
	public static void main(String[] args) {
		// uncomment to see
		// e

		// Phone phone = new Tablet();
		// System.out.println(phone.keyboard + ":" + phone.playMovie);
	}
}