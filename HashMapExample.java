package com.javainuse;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "NIkhila";
}
	public static void main(String[] args) {

		HashMapExample hash = new HashMapExample();
		System.out.println(hash.toString());

		Map<Integer, String> map = new HashMap();//
		// calculate hashcode--515f550a
		// hc & (n-1)--> index --0 t0 15
		// 0

		map.put(null, "Jhansi");
		map.put(4, "Nani");
		map.put(12, "NIkhila");
		map.put(12, "India");// hash code also but some times same hash codes
		map.put(13, "NIkhila");
		map.put(null, "NIkhila");

		System.out.println(map);
	}
}
