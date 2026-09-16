package CIET;

import java.util.*;

class Employee implements Comparable<Employee> {
	String name;
	int salary;
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public int compareTo(Employee other) {
		int result = Integer.compare(this.salary, other.salary);
		if (result != 0) {
			return result;
		}
		return this.name.compareTo(name);
		
	}
	public String toString() {
		return "name : " + name + ", salary : " + salary;
	}
}

class comparable {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Ram", 90000));
		employees.add(new Employee("Koti", 32000));
		employees.add(new Employee("kishor", 80000));
		System.out.println("Before sorting");
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees);
		System.out.println("\nafter sorting");
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
		
	}
}