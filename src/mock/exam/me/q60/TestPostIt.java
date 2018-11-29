package mock.exam.me.q60;

/*
 * Page: 565 (596 in pdf)
 * 
 * ME-Q60) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// Paper:1

// b - wrong
// Paper:0

// c - wrong
// Paper:0
// Paper:1

// d
// Paper:1
// Paper:0

class Paper {
	Paper() {
		this(10);
		System.out.println("Paper:0");
	}

	Paper(int a) {
		System.out.println("Paper:1");
	}
}

class PostIt extends Paper {
}

class TestPostIt {
	public static void main(String[] args) {
		Paper paper = new PostIt();
	}
}