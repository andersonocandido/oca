package mock.exam.me.q04;

/*
 * Page: 541 (572 in pdf)
 * 
 * ME-Q4) Given the following class (Student) definition, what is the output of
 * the following code? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// 100
// 10
// 98

// b
// 10
// 98

// c - wrong
// 100

// d - wrong
// 10

class Student {
	int marks = 10;
}

class Result {
	public static void main(String[] args) {
		Student s = new Student();
		switch (s.marks) {
		default:
			System.out.println("100");
		case 10:
			System.out.println("10");
		case 98:
			System.out.println("98");
		}
	}
}