package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;

public class Integerset {
	/**
	 * Myset is the set that uses ArrayList to implement set like features
	 *
	 */

	private ArrayList<Integer> MySet = new ArrayList<>();
	
	public Integerset(){
		
	};
	
	
	
	
	/**
	 * getter to retrieve our ArrayList
	 * @return the ArrayList set so that we can use it to reference other methods 
	 */
	public ArrayList<Integer> getSet() {
		return this.MySet;
	}
	
	/**
	 * empties the IntegerSet to clear all the contents using the .clear() method of ArrayList
	 */
	public void clear() {
		MySet.clear();
	}
	
	
	
	/**
	 * gives the length of IntegerSet
	 * @return length of the IntegerSet, using .size() method of ArrayList 
	 */
	public int length() {
		return this.getSet().size();
	}
	
	
	/**
	 * @param OtherSet of type IntegerSet
     * @return true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */
	public boolean equals(Integerset OtherSet) {
		if( OtherSet.length()!=this.length()){
			return false;

		}
		else {
			for (int i = 0; i < OtherSet.length(); i++) {
				if (!MySet.contains(OtherSet.getSet().get(i))) {	
					return false;
			}
		};
		return true;
		
		
	}
}; 

/**
 * checks if the value is in the set
 * @param number is an integer
 * @return true if the IntegerSet contains the number, else false by using ArrayList's .contain() function 
 */
	public boolean contains(int number) {
		return this.getSet().contains(number);
	}
	
	/**
	 * finds largest element in the set
	 * @return the largest element in MySet
	 * @throws IntegerSetException if the MySet is empty
	 */
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {

		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have largest element!");
		}
		return Collections.max(this.getSet());
		
	} 

	/**
	 * finds smallest element in the set
	 * @return the smallest element in MySet
	 * @throws IntegerSetException if the MySet is empty
	 */
	public int smallest() throws IntegerSetException {
		

		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have smallest element!");
		}
		
		return Collections.min(this.getSet());

		}
	/**
	 * Adds an item to the set if it is not already present there
	 * @param item value that is sent to be added in the set
	 */
	public void add(int item) {
		if (!this.getSet().contains(item)) {
			this.getSet().add(item);
		}
		
	}
	/**
	 * Removes an item from the set if the set does not contain it
	 * @param item value that is sent to be removed in the set
	 * @throws IntegerSetexception if the set is empty
	 */
	
	public void remove(int item) throws IntegerSetException {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("Can't remove from an empty set");
		}
		if (this.getSet().contains(item)) {
			this.getSet().remove(this.getSet().indexOf(item));
		}
	}
	
	/**
	 * adds the elements of intSetb to MySet if it does not already contains it
	 * @param intSetb of type IntegerSet
	 *  
	 */
	public void union(Integerset intSetb) {
		if (!this.getSet().equals(intSetb.getSet())) {
			
			for (int i = 0; i < intSetb.getSet().size(); i ++) {
				this.add(intSetb.getSet().get(i));
			}	
		}
	}
	
	/**
	 * intersects two sets, retains all values from intSetb in MySet
	 * @param intSetb of type IntegerSet
	 */
	
	public void intersect(Integerset intSetb) {
		this.getSet().retainAll(intSetb.getSet());
		
	}
	/**
	 * removes all the elements of intSetb from MySet to find the difference
	 * @param intSetb of type IntegerSet
	 * 
	 */
	
	public void diff(Integerset intSetb) {
		this.getSet().removeAll(intSetb.getSet());
	};
	
	/**
	 * checks if the MySet is empty
	 * @return true if the set is empty, else false
	 */
	public boolean isEmpty() {
		return this.getSet().isEmpty();
	}
	
	/**
	 * returns the string representation of MySet
	 * @return the string representation of the set
	 */
	public String toString() {
		return this.getSet().toString();
	}


}
