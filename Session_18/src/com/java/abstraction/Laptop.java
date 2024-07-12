package com.java.abstraction;

public class Laptop extends Desktop{


	public Laptop(int a, int b) {
		super(a, b);
		
	}

	void show() {
		System.out.println("From laptop class");
	}
}
