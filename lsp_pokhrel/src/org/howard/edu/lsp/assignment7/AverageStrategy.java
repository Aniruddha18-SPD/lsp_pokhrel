package org.howard.edu.lsp.assignment7;
import java.util.List;
/*
 * Interface for the both compute and compute_dropping_low_grades which will be implemented in 
 * the class that is responsible for calculating grades
 */
public interface AverageStrategy {
	public int compute (List<Integer> grades) throws EmptyListException;
	public int compute_dropping_low_grades (List<Integer> grades) throws EmptyListException;
	
}