package com.arrays;

public class binarySAexample {
	public static int binaryarray(int numbers[],int key) {
		int start=0,end=numbers.length-1;
		while(start<=end) {
		int	mid=(start+end)/2;
				if(numbers[mid]==key) {
					return mid;
			}
				if(numbers[mid] < key) {  
				    end = mid - 1;   // go left
				} else {             
				    start = mid + 1; // go right
				}
			/*	if(numbers[mid]<=key) { // right
					start=mid+1;
				}
				else {                   // left
					end=mid-1;
					
				}*/
			
			
		}
		return -1;   // not exists
		
	}
	public static void main(String[] args) {
		int numbers[]= {80,70,45,39,20,19,14};
		int key=14;
		System.out.println("index of numbers"+binaryarray(numbers,key));
	}

}






