package mock.exam.me.q29;

/*
 * Page: 552 (583 in pdf)
 * 
 * ME-Q29) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// JAVA
// JAVA

// b
// OCA
// JAVA

// c - wrong
// OCA
// OCA

// d - wrong
// None of the above

class EJavaCourse {
	String courseName = "Java";
}

class University {
	public static void main(String[] args) {
		EJavaCourse[] courses = { new EJavaCourse(), new EJavaCourse() };
		courses[0].courseName = "OCA";
		for (EJavaCourse c : courses) {
			c = new EJavaCourse();
		}

		for (EJavaCourse c : courses) {
			System.out.println(c.courseName);
		}
	}
}