package mock.exam.me.q34;

/*
 * Page: 554 (585 in pdf)
 * 
 * ME-Q34) Paul defined his Laptop and Workshop classes to upgtrade his laptop's
 * memory. Do you think he succeeded? What is the output of this code? (Select 1
 * option.)
 * 
 * Correct answer: b
 */

// a - wrong
// 1 GB

// b
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
		laptop.memory = "2 GB";
	}
}