package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.assertTrue;
class IntegersetTest {

	@Test
	@DisplayName("Cases to Test Clear")
	void testClear() {
		Integerset set_a = new Integerset();
		set_a.add(1);
		set_a.add(2);
		set_a.add(3);
		set_a.clear();
		assertEquals("[]", set_a.toString());
		set_a.add(42);
		set_a.add(57);
		assertTrue(false == set_a.isEmpty());
		set_a.clear();
		assertTrue(true == set_a.isEmpty());
	}

	@Test
	@DisplayName("Cases to Test Length")
	void testLength() {
		Integerset set_b = new Integerset();
		set_b.add(1);
		set_b.add(2);
		set_b.add(3);
		set_b.add(4);
		assertEquals(4, set_b.length());
		assertNotEquals(10, set_b.length());
	}

	@Test
	void testEqualsIntegerset() {
		Integerset equal_set_a = new Integerset();
		Integerset equal_set_b = new Integerset();
		for (int i = 0; i < 4; i++) {
			equal_set_a.add(i);
			equal_set_b.add(i);
			
		}
		assertTrue(true == equal_set_a.equals(equal_set_b));
		equal_set_b.add(12);
		assertTrue(false == equal_set_a.equals(equal_set_b));
	}

	@Test
	void testContains() {
		Integerset in_a = new Integerset();
		in_a.add(100);
		in_a.add(200);
		in_a.add(300);
		in_a.add(400);
		assertTrue(true == in_a.contains(300));
		assertTrue(true == in_a.contains(200));
		assertTrue(false == in_a.contains(11));
	}
	void test_exception() {
        Integerset set_a = new Integerset();
        set_a.add(100);
        set_a.add(200);
        set_a.add(300);
        Exception exception = assertThrows(IntegerSetException.class, ()->{set_a.largest();});
        assertEquals("An empty set can't have largest element!", exception.getMessage());
	}
	void test_exception_smallest() {
        Integerset set_a = new Integerset();
        set_a.add(100);
        set_a.add(200);
        set_a.add(300);
        Exception exception = assertThrows(IntegerSetException.class, ()->{set_a.smallest();});
        assertEquals("An empty set can't have smallest element!", exception.getMessage());
	}
	@Test
	void testLargest() throws IntegerSetException {
		Integerset in_list = new Integerset();
		for (int i = 10; i < 25; i++) {
			in_list.add(i);
			
		}
		assertEquals(24, in_list.largest());
		in_list.add(1000);
		assertEquals(1000, in_list.largest());
		assertNotEquals(100, in_list.largest());
	}

	@Test
	void testSmallest() throws IntegerSetException {
		Integerset in_list = new Integerset();
		for (int i = 10; i < 25; i++) {
			in_list.add(i);
			
		}
		assertEquals(10, in_list.smallest());
	}

	@Test
	void testAdd() {
		Integerset in_add = new Integerset();
		in_add.add(101);
		in_add.add(202);
		in_add.add(303);
		in_add.add(405);
		assertTrue(true == in_add.contains(303));
		assertTrue(true == in_add.contains(202));
		assertTrue(false == in_add.contains(11));
	}

	@Test
	void testRemove() throws IntegerSetException {
		Integerset not_in = new Integerset();
		for (int i = 10; i < 25; i++) {
			not_in.add(i);
			
		}
		not_in.remove(12);
		not_in.remove(17);
	    assertTrue(false == not_in.contains(12));
	    assertTrue(false == not_in.contains(17));
	}

	@Test
	void testUnion() {
		Integerset set1 = new Integerset();
		Integerset set2 = new Integerset();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set2.add(30);
		set2.add(40);
		set2.add(50);
		set1.union(set2);
		assertNotEquals("[10, 30, 30]", set1.toString());
		assertNotEquals("[]", set1.toString());
		assertEquals("[10, 20, 30, 40, 50]", set1.toString());
	}

	@Test
	void testIntersect() {
		Integerset set1 = new Integerset();
		Integerset set2 = new Integerset();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set2.add(30);
		set2.add(40);
		set2.add(50);
		set1.intersect(set2);
		assertNotEquals("[]", set1.toString());
		assertEquals("[30]", set1.toString());
		assertNotEquals("[10, 20, 30, 40, 50]", set1.toString());
	}

	@Test
	void testDiff() {
		Integerset s1 = new Integerset();
		Integerset s2 = new Integerset();
		s1.add(10);
		s1.add(11);
		s1.add(22);
		s1.add(30);
		s2.add(30);
		s2.add(4);
		s2.add(25);
		s1.diff(s2);
		s2.diff(s1);
		assertEquals("[10, 11, 22]",s1.toString());
		assertEquals("[30, 4, 25]",s2.toString());
		assertNotEquals("[100, 1]",s1.toString());
		assertNotEquals("[101, 1, 25]",s2.toString());
		Integerset s7 = new Integerset();
		Integerset s8 = new Integerset();
		int[] setNums = {1,2,3,4};
		for (int x = 0; x < setNums.length; x++) {
			s7.add(setNums[x]);
		}
		s8.add(1);
		s8.add(6);
		s8.add(7);
		s7.diff(s8);
		s8.add(9);
		s8.diff(s7);
		assertEquals("[2, 3, 4]",s7.toString());
		assertEquals("[1, 6, 7, 9]", s8.toString());
	}

	@Test
	void testIsEmpty() {
		Integerset set_a = new Integerset();
		set_a.add(1);
		set_a.add(2);
		set_a.add(3);
		assertTrue(false == set_a.isEmpty());
		set_a.clear();
		assertTrue(true == set_a.isEmpty());
	}

	@Test
	void testToString() {
		Integerset to_str = new Integerset();
		to_str.add(1);
		to_str.add(2);
		to_str.add(3);
		assertEquals("[1, 2, 3]", to_str.toString());
		to_str.clear();
		assertEquals("[]", to_str.toString());
	}

}
