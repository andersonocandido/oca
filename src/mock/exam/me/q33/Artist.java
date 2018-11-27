package mock.exam.me.q33;

/*
 * Page: 554 (585 in pdf)
 * 
 * ME-Q33) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// 10

// b - wrong
// 12

// c - wrong
// No output

// d
// Compilation error

class ColorPack {
	int shadeCount = 12;

	// uncomment /* static */ to see
	/* static */ int getShadeCount() {
		return shadeCount;
	}
}

class Artist {
	public static void main(String[] args) {
		ColorPack pack1 = new ColorPack();
		System.out.println(pack1.getShadeCount());
	}
}