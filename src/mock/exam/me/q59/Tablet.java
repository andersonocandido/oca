package mock.exam.me.q59;

/*
 * Page: 565 (596 in pdf)
 * 
 * ME-Q59) Given the following code, which option, if used to replace // INSERT
 * CODE HERE, will enable a reference variable of type Roamable to refer to an
 * an object of the Phone class? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// Roamable var = new Phone();

// b - wrong
// Roamable var = (Roamable) Phone();

// c - wrong
// Roamable var = (Roamable) new Phone();

// d
// Because the interface Roamable and the class Phone are unrelated, a reference
// variable of type Roamable can't refer to an object of the class Phone.

interface Roamable {
}

class Phone {
}

class Tablet extends Phone implements Roamable {
	// INSERT CODE HERE
}