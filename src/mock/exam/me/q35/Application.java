package mock.exam.me.q35;

/*
 * Page: 554 (585 in pdf)
 * 
 * ME-Q35) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// landline

// b - wrong
// Smartphone

// c - wrong
// No output

// d
// Compilation error

public class Application {

	public static void main(String... args) {
		double price = 10;
		String model;
		if (price > 10)
			model = "Smartphone";
		else if (price <= 10)
			model = "landline";
		
		// uncomment to see
		// System.out.println(model);
	}
}