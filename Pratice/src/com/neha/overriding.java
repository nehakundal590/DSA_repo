package com.neha;
class object {
	public String toString() {
		return super.toString();
		
	}
}

class Demo1 extends object{
	int a=20;
	int b=70;
	void m1() {
		System.out.println("m1 method inside the class Demo");
	}
}

public class overriding {
	public static void main(String[] args) {
		Demo1 a1=new Demo1();
		a1.m1();
		System.out.println(a1.toString());
	}
	

}
