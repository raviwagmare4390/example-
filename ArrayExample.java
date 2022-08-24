package com.javainuse;

public class ArrayExample {
	int a = 12;

//RE
	public static void main(String[] args) {
//hash code
		int[] values2 = new int[3];// 120 12 1 0 0  0 0 0 4564
		values2[1] = 12;
		values2[0] = 120;
		//values2[2] = 1;
		//ASCII values
		values2[2]=2;

		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i]);
		}

	}

}
