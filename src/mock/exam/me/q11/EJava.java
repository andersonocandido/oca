package mock.exam.me.q11;

/*
 * Page: 544 (575 in pdf)
 * 
 * ME-Q11) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: a
 */

// a
// null0.0false025

// b - wrong
// null0false025

// c - wrong
// null0.0ffalse025

// d - wrong
// 0.0false025

// e - wrong
// 0false025

// f - wrong
// 0.0ffalse025

// g - wrong
// null0.0true025

// h - wrong
// 0true025

// i - wrong
// 0.0true025

// j - wrong
// Compilation error.

// k - wrong
// Runtime exception

interface Moveable {
	int move(int distance);
}

class Person {
	static int MIN_DIASTANCE = 5;
	int age;
	float height;
	boolean result;
	String name;
}

public class EJava {
	public static void main(String[] args) {
		Person person = new Person();
		Moveable moveable = (x) -> Person.MIN_DIASTANCE + x;
		System.out.println(person.name + person.height + person.result + person.age + moveable.move(20));
	}
}