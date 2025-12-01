package com.neha;

public class A {
	int instance=10;  //Instance variable
	static int staticvariable=30;
	
	void show() {
		int localvariable=20; //local variable
		System.out.println(localvariable);
	}
	
	public static void main(String[] args) {
		A a1=new A();
	System.out.println(a1.instance);
	a1.show();
	System.out.println(staticvariable);
		
	}

}
