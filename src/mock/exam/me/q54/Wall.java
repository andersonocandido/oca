package mock.exam.me.q54;

/*
 * Page: 563 (594 in pdf)
 * 
 * ME-Q54) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// red

// b
// blue

// c - wrong
// No output

// d - wrong
// Compilation error

public class Wall {
	public static void main(String[] args) {
		double area = 10.98;
		String color;
		if (area < 5)
			color = "red";
		else
			color = "blue";
		System.out.println(color);
	}
}