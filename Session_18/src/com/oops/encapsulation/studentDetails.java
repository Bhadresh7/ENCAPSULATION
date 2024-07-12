package com.oops.encapsulation;

public class studentDetails {
	public static void main(String[] args) {
		feeStructure fs=new feeStructure();
		fs.setName("Sofi");
		fs.setAge(15);
		fs.setSection("c");
		fs.setStd("X");
		fs.setFee(5000.00d);

		System.out.println(fs.getName());
		System.out.println(fs.getAge());
		System.out.println(fs.getSection());
		System.out.println(fs.getStd());
		System.out.println(fs.getFee());
		
	}
}
