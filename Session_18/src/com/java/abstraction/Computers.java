package com.java.abstraction;


class a extends Laptop{
	public a(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	void show() {
		System.out.println("From class a");
	}
}


public class Computers  {

	public static void main(String[] args) {
		a a=new a(0, 0);
		a.show();
		
	}
	
}
