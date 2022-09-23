package org.howard.edu.lsp.assignment2;


/*
 * this is the driver file
 * 
 */

public class Driver {
	public static void main(String[] args) {
		Combinations.compute(new int[] {5,5,15,10}, 15);
		Combinations.compute(new int[] {1,2,3,4,5,6}, 6);
		Combinations.compute(new int[] {},15);
		Combinations.compute(new int[] {10,94,105,97,10}, 1000);
	}
}
