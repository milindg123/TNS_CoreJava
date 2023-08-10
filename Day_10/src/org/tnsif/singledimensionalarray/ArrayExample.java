package org.tnsif.singledimensionalarray;
// Program to demonstrate on single / 1D array using compile time input
public class ArrayExample {

	public static void main(String[] args) {
		
		int arr[] = {66,22,50,60,40};
		System.out.println("Array elements at specific index:");
		System.out.println(arr[1]);
		
		System.out.println("\n\nArray elements are: ");
		
		for(int i:arr) {
			System.out.println(i+" ");
		}

	}

}
