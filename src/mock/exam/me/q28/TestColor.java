package mock.exam.me.q28;

/*
 * Page: 552 (583 in pdf)
 * 
 * ME-Q28) Given the following definitions of the classes ColorPencil and
 * TestColor, which option, if used to replace // INSERT CODE HERE, will
 * initialize the instance variable color of the reference variable myPencil
 * with the String literal value "RED"? (Select 1 option.)
 * 
 * Correct answer: a
 */

// a
// this.color = color;

// b
// color = color;

// c
// color = RED;

// d
// this.color = "RED";

class ColorPencil {
	String color;

	ColorPencil(String color) {
		// INSERT CODE HERE

		// a
		this.color = color;
	}
}

class TestColor {
	ColorPencil myPencil = new ColorPencil("RED");

	public static void main(String[] args) {
		TestColor t = new TestColor();
		System.out.println(t.myPencil.color);
	}
}