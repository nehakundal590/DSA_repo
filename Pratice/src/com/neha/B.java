package com.neha;

public class B {
	
    int instance=10;
    static int staticvariable=20;
    
    void display() {
    	int localvariable=40;
    	System.out.println(localvariable);
    	
    }
    public static void main(String[] args) {
    	B b1=new B();
		System.out.println(b1.instance);
		b1.display();
		System.out.println(staticvariable);
	}
}
