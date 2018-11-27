package mock.exam.me.q08;

/*
 * Page: 543 (574 in pdf)
 * 
 * ME-Q8) Given the following statements,
 * 
 * ********************************************com.ejava is a package
 * **********************class Person is defined in package com.ejava
 * **********************class Course is defined in package com.ejava
 * 
 * which of the following options correctly import the classes Person and Course
 * in the class MyEJava? (Select 3 options.)
 * 
 * Correct answer: a, c and d
 */

// a
// import com.ejava.*;
// class MyEJava {}

// b - wrong
// import com.ejava;
// class MyEJava {}

// c
// import com.ejava.Person;
// import com.ejava.Course;
// class MyEJava {}

// d
// import com.ejava.Person;
// import com.ejava.*;
// class MyEJava {}

// a
import com.ejava.*;

// c
import com.ejava.Person;
import com.ejava.Course;

// d
import com.ejava.Person;
import com.ejava.*;

class MyEJava {
	public static void main(String[] args) {
		Person p = new Person();
		Course c = new Course();
	}
}