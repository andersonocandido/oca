package mock.exam.me.q07;

/*
 * Page: 542 (573 in pdf)
 * 
 * ME-Q7) What is the output of the following code? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// The while loop won't execute; nothing will be printed.

// b - wrong
// The while loop will execute indefinitely, printing all numbers, starting from
// 1.

// c - wrong
// The while loop will execute indefinitely, printing all even numbers, starting
// from 0.

// d
// The while loop will execute indefinitely, printing all even numbers, starting
// from 2.

// e - wrong
// The while loop will execute indefinitely, printing all odd numbers, starting
// from 1.

// f - wrong
// The while loop will execute indefinitely, printing all odd numbers, starting
// from 3.

public class RocketScience {
	public static void main(String[] args) {
		int a = 0;
		while (a == a++) {
			a++;
			System.out.println(a);
		}
	}
}