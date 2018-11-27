package mock.exam.me.q09;

/*
 * Page: 543 (574 in pdf)
 * 
 * ME-Q9) Given that the following classes Animal and Forest are defined in the
 * same package, examine the code and select the correct statements (Select 2
 * options.)
 * 
 * Correct answer: a and c
 */

// a
// The class Forest prints Lion.

// b - wrong
// If the code on line 2 is changed as follows, the class Forest will print
// Lion:
// private void printKing() {

// c
// If the code on line 2 is changed as follows, the class Forest will print
// Lion:
// void printKing() {

// d - wrong
// If the code on line 2 is changed as follows, the class Forest will print
// Lion:
// default void printKing() {

class Animal { // line 1
	public void printKing() { // line 2
		System.out.println("Lion"); // line 3
	} // line 4
} // line 5

class Forest { // line 6
	public static void main(String... args) { // line 7
		Animal anAnimal = new Animal(); // line 8
		anAnimal.printKing(); // line 9
	} // line 10
} // line 11