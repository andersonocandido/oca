package mock.exam.me.q22;

/*
 * Page: 549 (580 in pdf)
 * 
 * ME-Q22) Given the following, which options, when inserted at // INSERT CODE HERE,
 * will output 14? (Select 2 options.)
 * 
 * Correct answer: a and b
 */

// a
// for (char c1 : arrC1) {
// 	for (char c2 : arrC2) {
// 		if (c2 == 'a')
// 			break;
// 		ctr++;
// 	}
// }

// b
// for (char c1 : arrC1)
// for (char c2 : arrC2) {
//	if (c2 == 'a')
//		break;
//	ctr++;
// }

// c - wrong
// for (char c1 : arrC1)
// for (char c2 : arrC2)
// 	if (c2 == 'a')
// 		break;
// ctr++;

// d - wrong
// for (char c1 : arrC1) {
// 	for (char c2 : arrC2) {
// 		if (c2 == 'a')
// 			continue;
// 		ctr++;
// 	}
// }

class Result {
	public static void main(String[] args) {
		int ctr = 10;
		char[] arrC1 = new char[] { 'P', 'a', 'u', 'l' };
		char[] arrC2 = new char[] { 'H', 'a', 'r', 'r', 'y' };
		// INSERT CODE HERE

		// a
		for (char c1 : arrC1) {
			for (char c2 : arrC2) {
				if (c2 == 'a')
					break;
				ctr++;
			}
		}

		// b
		for (char c1 : arrC1)
			for (char c2 : arrC2) {
				if (c2 == 'a')
					break;
				ctr++;
			}

		// c - wrong
		// for (char c1 : arrC1)
		// for (char c2 : arrC2)
		// if (c2 == 'a')
		// break;
		// ctr++;

		// d - wrong
		// for (char c1 : arrC1) {
		// for (char c2 : arrC2) {
		// if (c2 == 'a')
		// continue;
		// ctr++;
		// }
		// }

		System.out.println(ctr);
	}
}