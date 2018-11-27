package mock.exam.me.q48;

/*
 * Page: 560 (591 in pdf)
 * 
 * ME-Q48) Given the following code, which option, if used to replace // INSERT
 * CODE HERE, will define an overloaded rideWave method? (Select 1 option.)
 * 
 * Correct answer: c
 */

// a - wrong
// public String[] rideWave() { return null; }

// b - wrong
// protected void riceWave(int a) {}

// c
// private void rideWave(int value, String value2) {}

// d - wrong
// default StringBuilder rideWave (StringBuffer a) { return null; }

public class Raft {

	public String rideWave() {
		return null;
	}

	// INSERT CODE HERE

	// c
	private void rideWave(int value, String value2) {
	}
}