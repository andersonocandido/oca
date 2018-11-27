package mock.exam.me.q43;

/*
 * Page: 558 (589 in pdf)
 * 
 * ME-Q43) How many Fish did the Whale (defined as follows) manage to eat?
 * Examine the following code and select the correct statements (choose 2
 * options).
 * 
 * Correct answer: b and d
 */

// a - wrong
// The code doesn't compile.

// b
//The code doesn't print a value.

// c - wrong
// The code prints 0.

// d
// Changing ++Fish.count to Fish.count++ will give the same results.

class Whale {
	public static void main(String[] args) {
		boolean hungry = false;
		while (hungry = true) {
			++Fish.count;
		}
		System.out.println(Fish.count);
	}
}

class Fish {
	static byte count;
}