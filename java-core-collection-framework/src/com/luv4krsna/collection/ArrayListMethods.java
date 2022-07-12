package com.luv4krsna.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		// resizing the array takes O(N)
		// simply adding or removing element from last it is O(1)
		List<String> names = new ArrayList<>();

		names.add("Kevin"); // O(1) ..
		names.add("Adam");
		names.add("Ana");
		names.add(1, "Raj"); // O(N)
		System.out.println(names);
		
		// random indexing in O(1)
		System.out.println(names.get(0));

		// insert item into a given index - O(N) as lower shifting needs to be done for all the below items
		names.add(0, "Daniel");
		System.out.println(names);
		
		// O(N) as upper shifting needs to be done for all the below items
		names.remove(0);
		System.out.println(names);

		// contains will check whether the item is present in the array O(N)
		System.out.println(names.contains("Katy"));

		Object[] o = names.toArray();

		// ARRAYLIST (ARRAYS) ARE FAST IF WE MANIPULATE THE LAST ITEM

		// because of the Iterable interface
		for (Object s : o)
		{
			System.out.println(s);
		}
	}

}
