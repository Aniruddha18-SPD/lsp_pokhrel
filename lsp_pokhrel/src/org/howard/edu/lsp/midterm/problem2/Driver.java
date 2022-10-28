package org.howard.edu.lsp.midterm.problem2;

public class Driver {
	
	public static void main(String[] args) {
		Person p1 = new Person("Anirudd", 52, "010-11-0202");
		Person p2 = new Person("Ahana", 52, "010-11-0202");
		Person p3 = new Person("Cam", 57, "112-11-1111");
		Person p4 = new Person("Mitch", 27, "012-34-9999");
		Person p6 = new Person("Micheal", 38, "123-34-9999");

		
		System.out.println("#####Testing for equals() method#####");
		System.out.println(p3.toString());
		System.out.println(p2.toString());
		if (p2.equals(p3)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		System.out.println();
		System.out.println(p1.toString());
		System.out.println(p4.toString());
		if (p1.equals(p4)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		System.out.println();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		if (p1.equals(p2)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		System.out.println();
		System.out.println(p1.toString());
		System.out.println(p3.toString());
		if (p1.equals(p3)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		System.out.println();
		System.out.println(p3.toString());
		System.out.println(p6.toString());
		if (p3.equals(p6)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		System.out.println();
		System.out.println(p3.toString());
		System.out.println(p6.toString());
		
		if (p3.equals(p6)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		System.out.println();
		System.out.println(p4.toString());
		System.out.println(p6.toString());
		if (p4.equals(p6)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		
		System.out.println();
		System.out.println(p4.toString());
		System.out.println(p6.toString());
		if (p4.equals(p6)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}
		
		System.out.println("******Testing for toString() method*****");
		System.out.println();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p6.toString());
		System.out.println();
		
	}
	
}
