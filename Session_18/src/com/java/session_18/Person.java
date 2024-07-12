package com.java.session_18;
import com.java.example.personMethods;
import com.java.example.privateMethods;
import com.java.example.protectedMethods;
//import java.util.Scanner;
class override extends protectedMethods{
	protected void showName(String name) {
		System.out.println("This is "+ name);
	}
}

public class Person {

	public static void main(String[] args) {

		privateMethods pr= new privateMethods();
		personMethods pm=new personMethods();
		protectedMethods pd=new protectedMethods();

		override o=new override();
		o.showName("William");
		pm.showAge(12);
	}

}
