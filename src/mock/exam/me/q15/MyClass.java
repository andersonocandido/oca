package mock.exam.me.q15;

/*
 * Page: 546 (577 in pdf)
 * 
 * ME-Q15) Which the following options defines the correct structure of a Java
 * class that compiles successfully? (Select 1 option.)
 * 
 * Correct answer: d
 */

// a - wrong
// import com.ejava.guru;
// import com.ejava.oracle;
// class MyClass {
// int age = /* 25 */ 74;
// }

// b - wrong
// import com.ejava.guru.*;
// import com.ejava.oracle.*;
// package com.ejava;
// class MyClass {
// String name = "e" + "Ja /*va*/ v";
// }

// c - wrong
// class MyClass {
// import com.ejava.guru.*;
// }

// d
// class MyClass {
// int abc;
// String course = // this is a comment
// "eJava";
// }

// e - wrong
// None of the above

class MyClass {
	int abc;
	String course = // this is a comment
			"eJava";
}