package org.howard.edu.lsp.assignment3;
import org.howard.edu.lsp.assignment3.IntegerSetException;
import org.howard.edu.lsp.assignment3.IntegerSet;

/**
 * @author Aniruddha Pokhrel
 * Test file to test all the methods as well as Exception Handling
 */

public class Driver {
	
	/**
	 * Prints all the test cases with their outputs from IntegerSet and its method implementations
	 *
	 */
	public static void main (String[] args) throws IntegerSetException {
	IntegerSet set1 = new IntegerSet();
	
	//adds the value to the set1
	set1.add(0);
	set1.add(1);
	set1.add(2);
	
	//checks the add and to String function representation of set1
	System.out.println("Value of Set1 is:"+ " " + set1.toString());
	//returns smallest value of set1
	System.out.println("Smallest value of Set1 is:"+ " " + set1.smallest());
	//returns largest value of set1
	System.out.println("Largest value of Set1 is:"+ " " + set1.largest());
	//checking contains
	System.out.println("set1.contains(6) returns: "+ " " + set1.contains(6));
	System.out.println("set1.contains(1) returns: "+ " " + set1.contains(1));

	IntegerSet set2 = new IntegerSet();
	set2.add(4);
	set2.add(5);

	
	
	//checking union
	System.out.println("union of Set1 and Set2");
	System.out.println("Value of Set1 is:" + set1.toString());
	System.out.println("Value of Set2 is:" + set2.toString());
	set1.union(set2);// union of set1 and set2
	
	// result of union of set1 and set2

	System.out.println("Result of union of Set1 and Set2" + set1.toString());
	
	//checking intersection
	//adding identical elements to set2
	set2.add(1);
	set2.add(2);
	System.out.println("Value of Set1 is:" + set1.toString());
	System.out.println("Value of Set2 is:" + set2.toString());
	//performing intersection
	set1.intersect(set2);
	//result of intersection of set1 and set2
	System.out.println("Result of intersection of Set1 and Set2" + set1.toString());

	//checking clear
	set1.clear();
	System.out.println("Value of Set1 after clearing is:" + set1.toString());
	//checking remove
	System.out.println("Value of Set2 is:" + set2.toString());

	set2.remove(1);
	System.out.println("Value of Set2 after removing is:" + set2.toString());

	//checking difference
	set1.add(5);
	set1.add(6);
	System.out.println("Value of Set1 is:" + set1.toString());
	System.out.println("Value of Set2 is:" + set2.toString());
	set1.diff(set2);
	System.out.println("Result of difference of Set1 and Set2 is: " + set1.toString());
    
	//checking IntegerSetException
	
	// clearing set 1 and set 2
	
	set1.clear();
	set2.clear();
	// checking isEmpty
	System.out.println("Set1.isEmpty() after clearing: "+ set1.isEmpty());
	
	//let's check IntegerSetException while removing from empty set
	try {
		set1.remove(0);
	}
	catch (IntegerSetException e) {
		System.out.println(e.getMessage());

	}
	
	//let's check IntegerSetException while finding greatest from empty set
	try {
		set1.largest();
	}
	
	catch (IntegerSetException e) {
		System.out.println(e.getMessage());

	}
	
	//let's check IntegerSetException while finding smallest from empty set
	 try {set1.smallest();}
	 catch (IntegerSetException e) {
			System.out.println(e.getMessage());

		}
	 set1.add(10);
	 set1.add(4);
	 System.out.println("Value of Set1 after adding 10 and 4 is:" + set1.toString());

	 System.out.println("The length of Set1 is :" + set1.length());
	 
	 //let's remove from a set the value thats not there
	 
	 System.out.println("Value of Set1 is:" + set1.toString());
	 set1.remove(0);
	 System.out.println("Value of Set1 after removing 0 which is not there is:" + set1.toString());
	 // checking equals
	 set2.clear();
	 set2.add(10);
	 set2.add(4);
	 System.out.println("Value of Set1 is:" + set1.toString());
	 System.out.println("Value of Set2 is:" + set2.toString());
	 set1.equals(set2);
	 System.out.println("Value of Set2 after running set2.equals(set2) is:" + set1.equals(set2));

}}