package mock.exam.me.q61;

/*
 * Page: 566 (597 in pdf)
 * 
 * ME-Q61) Examine the following code and select the correct statement (choose 1
 * option).
 * 
 * Correct answer: b
 */

// a - wrong
// The code will print LionX.

// b
// The code will print Lion.

// c - wrong
// The code will print Lion if line 5 is changed to the following:
// ejg = sb1.append("X").substring(sb1.indexOf('L'), sb1.indexOf('X'));

// d - wrong
// The code will compile only when line 4 is changed to the following:
// StringBuilder ejg = null;

class StringBuilders { // line 1
	public static void main(String... args) { // line 2
		StringBuilder sb1 = new StringBuilder("eLion"); // line 3
		String ejg = null; // line 4
		ejg = sb1.append("X").substring(sb1.indexOf("L"), sb1.indexOf("X")); // line 5
		System.out.println(ejg); // line 6
	} // line 7
} // line 8