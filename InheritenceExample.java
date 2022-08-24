package com.javainuse;

//extends --> Inheritence--> re-use mechanism
//multiple inheritence-- Interafces
public class InheritenceExample extends E implements C, F {

	public static void main(String[] args) {
		InheritenceExample i = new InheritenceExample();
		i.sub();

	}

	@Override
	public void add() {

	}

}

interface F {
	// abstract method
	public void add();
}

interface C {
	public void add();
}

class E {

	public void sub() {
		System.out.println("hello");
	}

}

class D {

	public void sub() {
		System.out.println("hi");
	}

}
