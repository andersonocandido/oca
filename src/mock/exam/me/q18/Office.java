package mock.exam.me.q18;

/*
 * Page: 547 (578 in pdf)
 * 
 * ME-Q18) Examine the following code and select the correct statement(choose 1
 * option.)
 * 
 * Correct answer: a
 */

// a
// The object referred to by object e is eligible for garbage collection on line
// 8.

// b - wrong
// The object referred to by object e is eligible for garbage collection on line
// 9.

// c - wrong
// The object referred to by object e isn't eligible for garbage collection
// because its member variable mgr isn't set to null.

// d - wrong
// The code throws a runtime exception and the code execution never reaches line
// 8 or line 9.

class Emp { // line 1
	Emp mgr = new Emp(); // line 2
} // line 3

class Office { // line 4
	public static void main(String[] args) { // line 5
		Emp e = null; // line 6
		e = new Emp(); // line 7
		e = null; // line 8
	} // line 9
} // line 10