package mock.exam.me.q55;

/*
 * Page: 563 (594 in pdf)
 * 
 * ME-Q55) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// 100
// 200

// b
// 100
// 100

// c - wrong
// 200
// 200

// d - wrong
// Code fails to compile.

class Diary {
	int pageCount = 100;

	int getPageCount() {
		return pageCount;
	}

	void setPageCount(int val) {
		pageCount = val;
	}
}

class ClassRoom {
	public static void main(String[] args) {
		System.out.println(new Diary().getPageCount());
		new Diary().setPageCount(200);
		System.out.println(new Diary().getPageCount());
	}
}