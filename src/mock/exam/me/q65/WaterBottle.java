package mock.exam.me.q65;

/*
 * Page: 568 (599 in pdf)
 * 
 * ME-Q65) Examine the following code and select the correct statements (choose
 * 2 options).
 * 
 * Correct answer: b and d
 */

// a - wrong
// A base class can't pass reference variables of its defined class as method
// parameters in constructors.

// b
// The class compiles successfully - a base class can use reference variables of
// its derived class as method parameters.

// c - wrong
// The class Bottle defines two overloaded constructors.

// d
// The class Bottle can access only one constructor.

class Bottle {
	void Bottle() {
	}

	void Bottle(WaterBottle w) {
	}
}

class WaterBottle extends Bottle {
}