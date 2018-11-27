package mock.exam.me.q01;

/*
 * Page: 539 (570 in pdf)
 * 
 * ME-Q1) Given the following definition of the classes Animal, Lion and
 * Jumpable, select the correct combinations of assignments of a variable that
 * dont't result in compilation errors or runtime exceptions (Select 2 options).
 * 
 * Correct answer: b and e
 */

// a - wrong
// Jumpable var1 = new Jumpable();

// b
// Animal var2 = new Animal();

// c - wrong
// Lion var3 = new Animal();

// d - wrong
// Jumpable var4 = new Animal();

// e
// Jumpable var5 = new Lion();

// f - wrong
// Jumpable var6 = (Jumpable) (new Animal());

class Animal {
}

interface Jumpable {
}

class Lion extends Animal implements Jumpable {
}

class Result {
	public static void main(String[] args) {
		// b
		Animal var2 = new Animal();

		// e
		Jumpable var5 = new Lion();
	}
}