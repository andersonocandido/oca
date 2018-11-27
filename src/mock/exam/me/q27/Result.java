package mock.exam.me.q27;

/*
 * Page: 551 (582 in pdf)
 * 
 * ME-Q27) What is true about the following code? (Select 1 option.)
 * 
 * Correct answer: a
 */

// a
// The class ShoeFactory has a total of two overloaded constructors.

// b - wrong
// The class ShoeFactory has three overloaded constructors, two user-defined
// constructors, and one default constructor.

// c - wrong
// The class ShoeFactory will fail to compile.

// d - wrong
// The addition of the following constructor will increment the number of
// constructors of the class ShoeFactory to 3:
//
// private ShoeFactory (Shoe arg) {}

class Shoe {
}

class Boot extends Shoe {
}

class ShoeFactory {
	ShoeFactory(Boot val) {
		System.out.println("boot");
	}

	ShoeFactory(Shoe val) {
		System.out.println("shoe");
	}
}

class Result {
	// a
	ShoeFactory shoeFactory1 = new ShoeFactory(new Boot());
	ShoeFactory shoeFactory2 = new ShoeFactory(new Shoe());
}