package mock.exam.me.q19;

/*
 * Page: 548 (579 in pdf)
 * 
 * ME-Q19) Given the following,
 * 
 * long result;
 * 
 * which options are correct declarations of methods that accept two String
 * arguments and an int argument and whose return value can be assigned to the
 * variable result? (Select 3 options.)
 * 
 * Correct answer: a, e and g
 */

// a
// Short myMethod1(String str1, int str2, String str3)

// b - wrong
// Int myMethod2(String val1, int val2, String val3)

// c - wrong
// Byte myMethod3(String val1, val2, int a)

// d - wrong
// Float myMethod4(String val1, val2, int val3)

// e
// Long myMethod5(int str2, String str3, String str1)

// f - wrong
// Long myMethod6(String... val1, int val2)

// g
// Short myMethod7(int val1, String... val2)

class Result {

	// a
	Short myMethod1(String str1, int str2, String str3) {
		return Short.MAX_VALUE;
	}

	// e
	Long myMethod5(int str2, String str3, String str1) {
		return Long.MAX_VALUE;
	}

	// g
	Short myMethod7(int val1, String... val2) {
		return Short.MAX_VALUE;
	}

	public static void main(String[] args) {
		long result;
		Result r = new Result();
		result = r.myMethod1("1", 1, "1");
		result = r.myMethod5(1, "1", "1");
		result = r.myMethod7(1, "1", "1");
	}
}