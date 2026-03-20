package com.array;

public class arrayLS {
	//function
		public static int getLargest(int number[]) {
			// variable
			int Largest=Integer.MIN_VALUE;  //- infinity
			int Smallest=Integer.MAX_VALUE;
				for(int i=0;i<number.length;i++) {
				if(Largest<number[i]) {
					Largest=number[i];
				}
					if(Smallest>number[i]) {
						Smallest=number[i];
						
					}
					}
				System.out.println(Smallest);
				return Largest;
				
			}
		
		public static void main(String[] args) {
			int number[]= {1,2,6,4,5};
			System.out.println(getLargest(number));
			
		}

	}
	// Time complexity O(n);



