package com.valuemomentum.training.bank.MyMaven;

public class customer {
	int accno;
	String name;
	Double bal;
	public customer(int accno, String name, Double bal) {
		super();
		this.accno = accno;
		this.name = name;
		this.bal = bal;
	}
	void display() {
		System.out.println("---------customer details--------------");
		System.out.println(this.name+"  "+this.accno+"   "+this.bal);
	}
}
