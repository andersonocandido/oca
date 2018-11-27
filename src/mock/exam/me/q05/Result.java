package mock.exam.me.q05;

/*
 * Page: 541 (572 in pdf)
 * 
 * ME-Q5) Given the following code, which code can be used to create and
 * initialize an object of the class ColorPencil? (Select 2 option.)
 * 
 * Correct answer: c and d
 */

// a - wrong
// ColorPencil var1 = new ColorPencil();

// b - wrong
// ColorPencil var1 = new ColorPencil(RED);

// c
// ColorPencil var1 = new ColorPencil("RED");

// d
// Pencil var4 = new ColorPencil("BLUE");

class Pencil {
}

class ColorPencil extends Pencil {
	String color;

	ColorPencil(String color) {
		this.color = color;
	}
}

class Result {

	public static void main(String[] args) {
		// c
		ColorPencil var1 = new ColorPencil("RED");

		// d
		Pencil var4 = new ColorPencil("BLUE");
	}
}