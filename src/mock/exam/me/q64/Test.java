package mock.exam.me.q64;

/*
 * Page: 567 (598 in pdf)
 * 
 * ME-Q64) Given that the file Test.java, which defines the following code,
 * fails to compile, select the reasons for the compilation failure (choose 2
 * options).
 * 
 * Correct answer: b and c
 */

// a - wrong
// The class Person fails to compile.

// b
// The class Employee fails to compile.

// c
// The default constructor can call only no-argument constructor of a base
// class.

// d - wrong
// The code that creates the object of the class Employee in the class Test did
// not pass a String value to the constructor of the class Employee.

class Person {
	Person(String value) {
	}
}

// uncomment to see
class Employee /* extends Person */ {
}

class Test {
	public static void main(String[] args) {
		Employee e = new Employee();
	}
}