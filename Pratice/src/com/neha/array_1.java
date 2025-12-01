package com.neha;

import java.util.Scanner;

public class array_1 {
	private static int size;

	public static void main(String[] args) {
		System.out.println("enter the element");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=arr.length;i++) {
			System.out.println("given" +i+"elements");
			arr[i]=sc.nextInt();
			}
		System.out.println("given the elemts to find");
		int elements =sc.nextInt();
		int flag=0;
		
		for(int i=0;i<size;i++) {
			if(arr[i]==elements) {
				flag=1;
				System.out.println("elements found at index"+i);
			}
		}
		if(flag==0) {
			System.out.println("elements not found");
		}
	}

}
