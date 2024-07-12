package com.java.abstraction;

public interface Showable {
	void print() ;
	default void show() {
		System.out.println("Default Method");
	}
}
