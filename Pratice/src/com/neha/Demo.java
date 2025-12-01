package com.neha;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		
		while(num>0) {
		int a =(num%10)/10;
		int b=(num%10)/10;
		int c=(num%100)/10;
		System.out.println(a+b+c);
		
		
		}
	}

}
