package mock.exam.me.q40;

/*
 * Page: 557 (588 in pdf)
 * 
 * ME-Q40) Given the following definition of the class Animal and the interface
 * Jump, select the correct array declarations and initialization (choose 3
 * options).
 * 
 * Correct answer: a, c and d
 */

// a
// Jump eJump[] = { null, new Animal() };

// b - wrong 
// Jump[] eJump2 = new Animal()[22];

// c
// Jump[] eJump3 = new Jump[10];

// d
// Jump[] eJump4 = new Animal[87];

// e - wrong
// Jump[] eJump2 = new Jump()[12];

interface Jump {
}

class Animal implements Jump {
}

class Result {
	public static void main(String[] args) {
		// a
		Jump eJump[] = { null, new Animal() };

		// c
		Jump[] eJump3 = new Jump[10];

		// d
		Jump[] eJump4 = new Animal[87];
	}
}