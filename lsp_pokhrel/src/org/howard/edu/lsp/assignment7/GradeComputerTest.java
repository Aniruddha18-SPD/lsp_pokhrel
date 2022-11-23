package org.howard.edu.lsp.assignment7;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GradeComputerTest {

	@Test
	void testCompute() {
		List <Integer> lst_grades = new ArrayList<Integer>();
		lst_grades.add(10);
		lst_grades.add(20);
		lst_grades.add(30);
		lst_grades.add(40);
		lst_grades.add(60);
		GradeComputer  computeGrade = new GradeComputer();
		try {
			int result = computeGrade.compute(lst_grades);
			assertNotEquals(result,43);
			assertEquals(result,32);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		lst_grades.clear();
		lst_grades.add(40);
		lst_grades.add(40);
		lst_grades.add(80);
		lst_grades.add(90);
		lst_grades.add(31);
		GradeComputer  computeGrade1 = new GradeComputer();
		try {
			int result = computeGrade1.compute(lst_grades);
			assertNotEquals(result,56.2);
			assertEquals(result,56);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testCompute_dropping_low_grades() {
		List <Integer> lst_grades = new ArrayList<Integer>();
		lst_grades.add(10);
		lst_grades.add(20);
		lst_grades.add(30);
		lst_grades.add(40);
		lst_grades.add(60);
		GradeComputer computeGrade = new GradeComputer();
		try {
			int result = computeGrade.compute_dropping_low_grades(lst_grades);
			assertEquals(result,43);
			assertNotEquals(result,32);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		lst_grades.clear();
		lst_grades.add(11);
		lst_grades.add(0);
		lst_grades.add(30);
		lst_grades.add(87);
		lst_grades.add(60);
		GradeComputer computeGrade1 = new GradeComputer();
		try {
			int result = computeGrade1.compute_dropping_low_grades(lst_grades);
			assertEquals(result,59);
			assertNotEquals(result,59.3);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Testing EmptyListException")
	void testEmptyListException() {
		String expectedError;
		String messageToPrint;
		String message2;
		GradeComputer  computeGrade = new GradeComputer();
		List <Integer> lst_grades = new ArrayList<Integer>();
		Exception exception = assertThrows(EmptyListException.class, ()->{computeGrade.compute(lst_grades);});
		expectedError = "Can't calculate average. The list is Empty!";
		messageToPrint = exception.getMessage();
		message2 = ""; 
		assertEquals(expectedError, messageToPrint);
		assertNotEquals(expectedError, message2);
	}

}
