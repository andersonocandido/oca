package mock.exam.me.q13;

/*
 * Page: 545 (576 in pdf)
 * 
 * ME-Q13) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: g
 */

// a - wrong
// null0AB

// b - wrong
// null0.0AB

// c - wrong
// null0default

// d - wrong
// null0.0default

// e - wrong
// 0

// f - wrong
// 0.0

// g
// Compilation error

interface Keys {
	String keypad(String region, int keys);
}

public class Handset {
	public static void main(String[] args) {
		double price;
		String model;
		Keys varKeys = (region, keys) -> {
			if (keys >= 32)
				return region;
			else
				return "default";
		};
		// uncomment to see
		// System.out.println(model + price + varKeys.keypad("AB", 32));
	}
}