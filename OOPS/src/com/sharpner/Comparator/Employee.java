package com.sharpner.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		Comparator<Employee> comp = (e1, e2) -> {
			return e1.salary <= e2.salary ? 1 : -1;
		};
		List<Employee> li = new ArrayList<>();
		li.add(new Employee("Swaraj", 20000));
		li.add(new Employee("Jauuad", 22000));
		li.add(new Employee("Ashitosh", 18000));
		li.add(new Employee("Dhote", 35000));
		li.add(new Employee("Sandeep", 85000));
		li.add(new Employee("Lalit", 32000));
		Collections.sort(li, comp);
		for (Employee al : li) {
			System.out.println(al);
		}
	}

}
