package com.luv4krsna.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();

		// adding at first index in arraylist
		long now = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			array.add(0, i); // O(N) as shifting required for adding the first element

		}

		System.out.println("Time taken for arraylist first::" + (System.currentTimeMillis() - now));

		// get item at index
		now = System.currentTimeMillis();
		array.get(300000);
		System.out.println("Time taken for arraylist get at index::" + (System.currentTimeMillis() - now));

		// adding at first index in linkedlist O(1) as linked list has access to head
		// node
		LinkedList<Integer> list = new LinkedList<Integer>();

		now = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			list.addFirst(i); // O(1)

		}

		System.out.println("Time taken for linkedlist::" + (System.currentTimeMillis() - now));

		// removing from first index in linkedlist one by one- O(1) as linked list has
		// access to head
		// node

		now = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			list.removeFirst(); // O(1)

		}

		System.out.println("Time taken for linkedlist remove first::" + (System.currentTimeMillis() - now));

		// adding at last index in linkedlist O(1) being doubly linked list the head
		// node refers to last node also
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		now = System.currentTimeMillis();

		for (int i = 0; i < 500000; ++i) {
			list1.addLast(i); // O(1)

		}

		System.out.println("Time taken for linkedlist last::" + (System.currentTimeMillis() - now));

		// adding arbritarily O(N) as linear search required from going from node to
		// node till reach the req node
		now = System.currentTimeMillis();
		// list1.add(200000, 1);
		list1.get(300000);
		System.out.println("Time taken for linkedlist add arb::" + (System.currentTimeMillis() - now));
	}

}
