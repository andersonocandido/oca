package mock.exam.me.q49;

/*
 * Page: 561 (592 in pdf)
 * 
 * ME-Q49) Given the following code, which option, if used to replace // INSERT
 * CODE HERE, will correctly calculate the sum of all even numbers in the array
 * num and store it in the variable sum? (Select 1 option.)
 * 
 * Correct answer: c
 */

// a - wrong
// if (number % 2 == 0) continue;

// b - wrong
// if (number % 2 == 0) break;

// c
// if (number % 2 != 0) continue;

// d - wrong
// if (number % 2 != 0) break;

class Result {
	public static void main(String[] args) {
		int num[] = { 10, 15, 2, 17 };
		int sum = 0;
		for (int number : num) {
			// INSERT CODE HERE

			// c
			if (number % 2 != 0)
				continue;

			sum += number;
		}
	}
}