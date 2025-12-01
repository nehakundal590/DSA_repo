package com.neha;
 

public class this_key {
	 void age() {
		 System.out.println("age inside the main method");
		
	}
	 void m1() {
		 	System.out.println(this);
	 }
	 public static void main(String[] args) {
		this_key m3=new this_key();
		m3.age();
		m3.m1();
	}
	 

}
