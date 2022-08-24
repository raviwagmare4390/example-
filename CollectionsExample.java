package com.javainuse;
//java.lang

import java.util.ArrayList;
import java.util.List;

//what are the Object class
public class CollectionsExample {
	// LIST, SET, Map, QUEUE

	public static void main(String[] args) {
		Employee2 emp = new Employee2(17, "Nikhila");

		// object
		List<Employee2> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(emp);
		listOfEmployees.add(new Employee2(12, "Jhansi"));
		listOfEmployees.add(new Employee2(13, "HImadhar"));
		listOfEmployees.add(3, new Employee2(15, "india"));

		for (Employee2 emp2 : listOfEmployees) {
			
			System.out.println(emp2);

		}

	}

}

class Employee2 {
	int id;
	String name;



public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}