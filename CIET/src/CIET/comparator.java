package CIET;

import java.util.*;

class comparator1 implements Comparable<comparator1>{
	String name;
	comparator1(String name) {
		this.name = name;
		
	}
	public int compareTo(comparator1 other) {
		return this.name.compareTo(other.name);
	}
	public String toString(){
		return name;
	}
	
}



class comparator {
	public static void main(String[] args) {
		
		List<comparator1> employees = new ArrayList<>();
		
		employees.add(new comparator1("Ram"));
		employees.add(new comparator1("Ramana"));
		employees.add(new comparator1("Kotama"));
		
		System.out.println("Before sorting");
		
		for(comparator1 employee:employees) {			//don't know starting & ending
			System.out.println(employee);	
		}
		
        Collections.sort(employees); 
		System.out.println("\nafter sorting");
		for (comparator1 employee:employees) {
			System.out.println(employee);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//class comparator1 {
//		String name;
//		int marks;
//		comparator1(String name, int marks) {
//			this.name= name;
//			this.marks= marks;
//		}
//		@Override
//		public String toString() {
//			return name + " " + marks;
//		}
	//}

		
//		List<comparator1> students = new ArrayList<>();
//		students.add(new comparator1("Ram", 89));
//		students.add(new comparator1("koti", 56));
////		Comparator<comparator1> byMarks = (s1, s2) ->  //comparator
////		Integer.compare(s1.marks, s2.marks);
////		students.sort(byMarks);
//		
//		
//		
//		
//		Comparator<comparator1> byName = (s1, s2) ->
//		s1.name.compareTo(s2.name);
//		students.sort(byName);
//		System.out.println(students);
		
		
		
		
		
	}
}

