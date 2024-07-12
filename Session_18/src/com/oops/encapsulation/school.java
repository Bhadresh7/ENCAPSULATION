package com.oops.encapsulation;

public class school {

	private String name;
	private int age;
	private String std;
	private String section;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "school [name=" + name + ", age=" + age + ", std=" + std + ", section=" + section + "]";
	}

}
