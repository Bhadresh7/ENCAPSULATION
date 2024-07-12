package com.oops.encapsulation;


class  animal{
	public void sound() {
		System.out.println("animal sound");
	}
}


class dog extends animal{
	public void sound() {
		System.out.println("Bark");
	}
}

public class polymorphism {

	public static void main(String[] args) {
		dog d=new dog();
		animal a=new dog();
		a.sound();
		d.sound();
	}
}
