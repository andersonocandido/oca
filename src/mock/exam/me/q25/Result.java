package mock.exam.me.q25;

/*
 * Page: 550 (581 in pdf)
 * 
 * ME-Q25) Given the following code, which option, if used to replace // INSERT
 * CODE HERE, will make the code print numbers that are completely divisible by
 * 14? (Select 1 option.)
 * 
 * Correct answer: a
 */

// a
// continue;

// b - wrong
// exit;

// c - wrong
// break;

// d - wrong
// end;

class Result {
	public static void main(String[] args) {
		for (int ctr = 2; ctr <= 30; ctr++) {
			if (ctr % 7 != 0) {
				// INSERT CODE HERE

				// a
				continue;
			}
			if (ctr % 14 == 0) {
				System.out.println(ctr);
			}
		}
	}
}