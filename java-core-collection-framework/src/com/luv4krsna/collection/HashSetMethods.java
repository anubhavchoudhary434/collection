package com.luv4krsna.collection;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		
		HashSet<Long> hLong = new HashSet<Long>();
		HashSet<String> hStr = new HashSet<String>();
		
		hLong.add(1L);
		hLong.add(5L);
		hLong.add(3L);
		hLong.add(8L);
		hLong.add(5L);
		hLong.add(1L);
		
		hStr.add("1");
		hStr.add("5");
		hStr.add("3");
		hStr.add("8");
		hStr.add("5");
		hStr.add("1");
		
		System.out.println(hLong.toString().substring(1, hLong.toString().length()-1));
		System.out.println(hStr.toString().substring(1, hStr.toString().length()-1));

	}

}
