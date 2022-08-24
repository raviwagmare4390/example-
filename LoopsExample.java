package com.example.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LoopsExample implements Serializable {

	int id;
	int salary;
	transient int age;

	public LoopsExample(int id, int salary, int age) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		LoopsExample loopsExample = new LoopsExample(1, 1000, 27);
		SampleNew s = new SampleNew();
		String fileLocation = "C://Users//nmunagal//Desktop//sample.txt";

		try {
			FileOutputStream file = new FileOutputStream(fileLocation);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(loopsExample);
			file.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(fileLocation);
			ObjectInputStream ois = new ObjectInputStream(fis);
			LoopsExample loopsExample2 = (LoopsExample) ois.readObject();
			System.out.println(loopsExample2.getAge() + " " + loopsExample2.getId() + " " + loopsExample2.getSalary());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
