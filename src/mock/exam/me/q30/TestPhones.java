package mock.exam.me.q30;

/*
 * Page: 552 (583 in pdf)
 * 
 * ME-Q30) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: a
 */

// a
// Call-Phone
// Call-Phone

// b - wrong
// Call-Phone
// Call-SmartPhone

// c - wrong
// Call-Phone
// null

// d - wrong
// null
// Call-SmartPhone

class Phone {
	static void call() {
		System.out.println("Call-Phone");
	}
}

class SmartPhone extends Phone {
	static void call() {
		System.out.println("Call-SmartPhone");
	}
}

class TestPhones {
	public static void main(String... args) {
		Phone phone = new Phone();
		Phone smnartPhone = new SmartPhone();
		phone.call();
		smnartPhone.call();
	}
}