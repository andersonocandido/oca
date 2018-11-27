package mock.exam.me.q41;

/*
 * Page: 557 (588 in pdf)
 * 
 * ME-Q41) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: e
 */

// a - wrong
// Spring, Summer, Winter,

// b - wrong
// Spring, Autumn, Winter,

// c - wrong
// Autumn, Winter,

// d - wrong
// Compilation error

// e
// Runtime exception

import java.util.ArrayList;

class EJGArrayL {
	public static void main(String[] args) {
		ArrayList<String> seasons = new ArrayList<>();
		seasons.add(1, "Spring");
		seasons.add(2, "Summer");
		seasons.add(3, "Autumn");
		seasons.add(4, "Winter");
		seasons.remove(2);

		for (String s : seasons)
			System.out.println(s + ", ");
	}
}