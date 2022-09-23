package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;

public class Combinations{
	/*
	 * this class represents the combinations which is computing all sets of possibles indexes that add up to
	 * the given target. 
	 */
	static void print_value(ArrayList<Integer> v) {
		System.out.println(v);
	}
	static boolean[][]store_val;
	public static void compute(int[] input, int sum) {
		int n = input.length;
		ArrayList<Integer> list = new ArrayList<Integer>(input.length);
		for (int i = 0; i < input.length; i++)
		  list.add(Integer.valueOf(input[i]));
		System.out.println("List of numbers: " + list);
		System.out.println("Target : " + sum);
		System.out.println("The index values are: ");
		if (input.length == 0) {      
			System.out.println("[]");	//For the case when empty list is passed
		}
		printAllComb(input,n,sum);
	}
		
	static void search_depth(int input[], int i, int sum, ArrayList<Integer> num) {
		if (i ==0 && sum !=0 && store_val[0][sum]) {
			num.add(i);
			print_value(num);
			num.clear();
			return;
		}
		if (i == 0 && sum == 0) {
			print_value(num);
			num.clear();
			return;
		}
		if (store_val[i-1][sum]) {
			ArrayList<Integer> b = new ArrayList<>();
			b.addAll(num);
			search_depth(input, i-1, sum, b);
		}
		if (sum >= input[i] && store_val[i-1][sum-input[i]]) {
			num.add(i);
			search_depth(input, i-1,sum-input[i],num);
		}
	}
	 static void printAllComb(int input[], int n, int sum) {
		if (n ==0 || sum <0) {
			return;
		}
		store_val = new boolean[n][sum +1];
		for (int i =0; i<n; ++i) {
			store_val[i][0] = true;
		}
		if (input[0] <=sum) {
			store_val[0][input[0]] = true;
		}
		for (int i =1; i <n; ++i)
			for (int j = 0; j <sum +1; ++j)
				store_val[i][j] = (input[i]<= j) ? (store_val[i-1][j] || store_val[i-1][j-input[i]]) : store_val[i-1][j];
		if (store_val[n-1][sum] == false){
			System.out.println("[]" );
			return;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		search_depth(input, n-1, sum, arr);				
	}
	
}
	
	
	
