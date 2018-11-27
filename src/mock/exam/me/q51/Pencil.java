package mock.exam.me.q51;

/*
 * Page: 561 (592 in pdf)
 * 
 * ME-Q51) Choose the option that meets the following specification: Create a
 * well-encapsulated class Pencil whit one instance variable model. The value of
 * model should be accessible an modifiable outside Pencil. (Select 1 option.)
 * 
 * Correct answer: c
 */

// a
//class Pencil {
//	public String model;
//}

// b
//class Pencil {
//	public String model;
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String val) {
//		model = val;
//	}
//}

// c
class Pencil {
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String val) {
		model = val;
	}
}

// d
//class Pencil {
//	public String model;
//
//	private String getModel() {
//		return model;
//	}
//
//	private void setModel(String val) {
//		model = val;
//	}
//}