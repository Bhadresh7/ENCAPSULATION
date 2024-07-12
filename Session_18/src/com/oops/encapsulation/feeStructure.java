package com.oops.encapsulation;

public class feeStructure extends school{

	private double fee;

	@Override
	public String toString() {
		return "feeStructure [fee=" + fee + "]";
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	
	
}
