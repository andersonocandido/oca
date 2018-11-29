package mock.exam.me.q63;

/*
 * Page: 567 (598 in pdf)
 * 
 * ME-Q63) Given the following code, which option, if used to replace // INSTERT
 * CODE HERE, will enable the class Jungle to determine whether the reference
 * variable animal refers to an object of the class Lion and print 1? (Select 1
 * option.)
 * 
 * Correct answer: a
 */

// a
// if (animal instanceof Lion)

// b - wrong
// if (animal instanceOf Lion)

// c - wrong
// if (animal == Lion)

// d - wrong
// if (animal = Lion)

class Animal {
	float age;
}

class Lion extends Animal {
	int claws;
}

class Jungle {
	public static void main(String[] args) {
		Animal animal = new Lion();
		// INSERT CODE HERE
		// a
		if (animal instanceof Lion)
			System.out.println(1);
	}
}