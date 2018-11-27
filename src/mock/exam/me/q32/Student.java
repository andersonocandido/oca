package mock.exam.me.q32;

/*
 * Page: 552 (583 in pdf)
 * 
 * ME-Q32) A class Student is defined as follows. The creator of the class later
 * changes the method getName as follows. What are the implications of this
 * change (Select 2 options.)
 * 
 * Correct answer: b and c
 */

// a - wrong
// The classes that were using the class Student will fail to compile.

// b
// The classes that were using the class Student will work without any
// compilation issues.

// c
// The class Student is an example of well-encapsulated class.

// d - wrong
// The class Student exposes its instance variable outside the class.

public class Student {
	private String fName;
	private String lName;

	public Student(String first, String last) {
		fName = first;
		lName = last;
	}

	public String getName() {
		return fName + lName;
	}
}