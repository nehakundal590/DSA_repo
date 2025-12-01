package com.neha;
import java.util.Scanner;


public class Last_two_digit {
	public static void main(String[] args) {
		System.out.println("enter the number");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=n%10;
		b=(n/10)%10;
		 c=(a+b)+(a*b);
		System.out.println(c);
		
	}

}
