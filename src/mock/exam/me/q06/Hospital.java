package mock.exam.me.q06;

/*
 * Page: 541 (572 in pdf)
 * 
 * ME-Q6) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// 45Heart
// 0Liver

// b
// 45Liver
// 0Heart

// c - wrong
// 45Liver
// 45Heart

// d - wrong
// 45Heart
// 45Heart

// e - wrong
// Class fails to compile.

class Doctor {
	protected int age;

	protected void setAge(int val) {
		age = val;
	}

	protected int getAge() {
		return age;
	}
}

class Surgeon extends Doctor {
	Surgeon(String val) {
		specializaton = val;
	}

	String specializaton;

	String getSpecialization() {
		return specializaton;
	}
}

class Hospital {
	public static void main(String[] args) {
		Surgeon s1 = new Surgeon("Liver");
		Surgeon s2 = new Surgeon("Heart");
		s1.age = 45;
		System.out.println(s1.age + s2.getSpecialization());
		System.out.println(s2.age + s1.getSpecialization());
	}
}