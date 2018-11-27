package mock.exam.me.q02;

/*
 * Page: 540 (571 in pdf)
 * 
 * ME-Q2) Given de following code, which option, id used to replace / INSERT
 * CODE HERE /, will make the code print 1? (Select 1 option.)
 * 
 * Correct answer: c
 */

// a - wrong
// IndexPositionException

// b - wrong
// NullPointerException

// c
// ArrayIndexOutOfBoundsException

// d - wrong
// ArrayOutOfBoundsException

class Result {
	public static void main(String[] args) {
		try {
			String[][] names = { { "Andre", "Mike" }, null, { "Pedro" } };
			System.out.println(names[2][1].substring(0, 2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(1);
		}
	}
}