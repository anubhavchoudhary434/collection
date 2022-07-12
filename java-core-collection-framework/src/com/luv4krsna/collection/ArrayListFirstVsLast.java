package com.luv4krsna.collection;

import java.util.ArrayList;

public class ArrayListFirstVsLast {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();

		// adding at first index in arraylist O(N)
		long now = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			array.add(0, i); // O(N) as shifting required for adding the first element

		}

		System.out.println("Time taken for arraylist first::" + (System.currentTimeMillis() - now));

		// removing last index each time O(1)
		now = System.currentTimeMillis();
		int size = array.size();
		for (int i = size - 1; i >= 0; i--) {

			array.remove(i);
		}

		System.out.println("Time taken for arraylist remove last::" + (System.currentTimeMillis() - now));
		System.out.println(array);

		// adding elements at last O(1)
		ArrayList<Integer> array1 = new ArrayList<Integer>();

		now = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			array1.add(i); // O(1)

		}

		System.out.println("Time taken for arraylist add last::" + (System.currentTimeMillis() - now));

		// removing at arbritary index O(N) - as below items shifts upwards
		now = System.currentTimeMillis();
		array1.remove(300000);
		System.out.println("Time taken for arraylist remove arbritary::" + (System.currentTimeMillis() - now));
		System.out.println(array1.size());
		
		// adding at arbritary index O(N) - as below items shifts downwards
		now = System.currentTimeMillis();
		array1.add(300000, 1);
		System.out.println("Time taken for arraylist remove arbritary::" + (System.currentTimeMillis() - now));
		System.out.println(array1.size());
	}

}
