package com.java.abstraction;

import java.util.Collection;


class interfaceExample implements Showable{

	@Override
	public void print() {
		
	}

}

public class nonAbstractClass  {

	public static void main(String[] args) {
		interfaceExample ie=new interfaceExample();
		ie.show();
	}
}
