package org.howard.edu.lsp.assignment7;
import java.util.Collections;
import java.util.List;


public class GradeComputer implements AverageStrategy{
	/*
	 * Here list with integer grades is passed to the function
	 * Average is calculated and returned
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		int sum = 0;
		int count_length = 0;
		int average = 0;
		for (int i: grades) {
			sum += i;
			count_length++;
		}
		if (count_length == 0 ) {
			throw new EmptyListException("Can't calculate average. The list is Empty!");
		}
		average = sum/count_length; 
		return average;
	}
	/*
	 * Here list with integer grades is passed to the function
	 * Average is calculated without taking in account of the lowest two grades
	 */
	@Override
	public int compute_dropping_low_grades(List<Integer> grades) throws EmptyListException {
		int sum = 0;
		int count_length = 0;
		int new_average = 0;
		Collections.sort(grades);
		count_length = grades.size();
		if (count_length == 0) {
			throw new EmptyListException("Can't calculate average. The list is Empty!");
		}
		int lowest_two_grades = grades.get(0) + grades.get(1);
		for (int i : grades) {
			sum = sum + i;
		}
		new_average = (sum-lowest_two_grades)/(count_length-2);
		return new_average;
		
	}

}