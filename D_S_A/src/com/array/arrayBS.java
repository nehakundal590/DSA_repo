package com.array;

public class arrayBS {
	public static int binaryarray(int numbers[],int key) {
		int start=0,end=numbers.length-1;
		while(start<=end-1) {
		int	mid=(start+end)/2;
				if(numbers[mid]==key) {
					return mid;
			}
				if(numbers[mid]<=key) { // right
					start=mid+1;
				}
				else {                   // left
					end=mid-1;
					
				}
			
			
		}
		return -1;   // not exists
		
	}
	public static void main(String[] args) {
		int numbers[]= {2,4,6,8,10,12};
		int key=20;
		System.out.println("index of numbers"+binaryarray(numbers,key));
	}

}



