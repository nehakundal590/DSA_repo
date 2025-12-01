package com.neha;

public class constructor {
	constructor(){
		System.out.println("constructor inside the main method");
	}
	void display() {
		System.out.println("display inside the main method");
		
	}
	public static void main(String[] args) {
		constructor c1=new constructor();
		c1.display();
	}

}
