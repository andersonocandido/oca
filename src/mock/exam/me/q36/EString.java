package mock.exam.me.q36;

/*
 * Page: 555 (586 in pdf)
 * 
 * ME-Q36) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: f
 */

// a - wrong
// 234567890

// b - wrong
// 34567890

// c - wrong
// 234456789

// d - wrong
// 3456789

// e - wrong
// Compilation error

// f
// Runtime exception

class EString {
	public static void main(String[] args) {
		String eVal = "123456789";
		System.out.println(eVal.substring(eVal.indexOf("2"), eVal.indexOf(0)).concat("0"));
	}
}