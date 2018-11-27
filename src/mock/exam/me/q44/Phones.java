package mock.exam.me.q44;

/*
 * Page: 558 (589 in pdf)
 * 
 * ME-Q44) Given the following code, which option, id used to replace / REPLACE
 * CODE HERE /, will make the code print the name of the phone with the position
 * at witch it's stored in the array phones? (Select 1 option)
 * 
 * Correct answer: g
 */

// a - wrong
// System.out.println(phones.count + ":" + phone);

// b - wrong
// System.out.println(phones.counter + ":" + phone);

// c - wrong
// System.out.println(phones.getPosition() + ":" + phone);

// d - wrong
// System.out.println(phones.getCtr() + ":" + phone);

// e - wrong
// System.out.println(phones.getCount() + ":" + phone);

// f - wrong
// System.out.println(phones.pos + ":" + phone);

// g
// None of the above

class Phones {
	public static void main(String[] args) {
		String[] phones = { "BlackBerry", "Android", "iPhone" };
		for (String phone : phones) {
			/* REPLACE CODE HERE */
		}
	}
}