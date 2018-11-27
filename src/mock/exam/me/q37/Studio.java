package mock.exam.me.q37;

/*
 * Page: 555 (586 in pdf)
 * 
 * ME-Q37) Examine the following code and select the correct statements (choose
 * 2 options).
 * 
 * Correct answer: c and e
 */

// a - wrong
// At least two objects are garbage collected on line 1.

// b - wrong
// At least one object is garbage collected on line 1.

// c
// No objects are garbage collected on line 1.

// d - wrong
// The number of objects that are garbage collected on line 1 is unknown.

// e
// At least two objects are eligible for garbage collection on line 2.

class Artist {
	Artist assitant;
}

class Studio {
	public static void main(String... args) {
		Artist a1 = new Artist();
		Artist a2 = new Artist();
		a2.assitant = a1;
		a2 = null; // Line 1
	}
	// Line 2
}