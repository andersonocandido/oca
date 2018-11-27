package mock.exam.me.q52;

/*
 * Page: 562 (593 in pdf)
 * 
 * ME-Q52) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: b
 */

// a - wrong
// Call-Phone
// Call-Phone

// b
// Call-Phone
// Call-SmartPhone

// c - wrong
// Call-Phone
// null

// d - wrong
// null
// Call-SmartPhone

class Phone {
	void call() {
		System.out.println("Call-Phone");
	}
}

class SmartPhone extends Phone {
	void call() {
		System.out.println("Call-SmartPhone");
	}
}

class TestPhones {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Phone smartPhone = new SmartPhone();
		phone.call();
		smartPhone.call();
	}
}