package mock.exam.me.q58;

/*
 * Page: 565 (596 in pdf)
 * 
 * ME-Q58) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: a
 */

// a
// 1 GB

// b - wrong
// 2 GB

// c - wrong
// Compilation error

// d - wrong
// Runtime exception

class Laptop {
	String memory = "1 GB";
}

class Workshop {
	public static void main(String[] args) {
		Laptop life = new Laptop();
		repair(life);
		System.out.println(life.memory);
	}

	public static void repair(Laptop laptop) {
		laptop = new Laptop();
		laptop.memory = "2 GB";
	}
}