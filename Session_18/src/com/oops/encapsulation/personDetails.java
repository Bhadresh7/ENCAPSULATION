package com.oops.encapsulation;

public class personDetails {

	public static void main(String[] args) {

		person p=new person();
		p.setName("James");
		p.setAge(23);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSalary());

		person p1=new person();
		p1.setName("William");
		p1.setAge(23);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getSalary());
	
	}

}
