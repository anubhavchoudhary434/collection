package com.luv4krsna.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		// USUALLY WE USE LINKED LIST TO MANIPULATE FIRST AND LAST ITEM IN O(1)
		LinkedList<Integer> list = new LinkedList<>();  // doubly linked list
		
		// adding or removing from first or last node is O(1) for doubly linked list
		// adding or removing from first node is O(1) for linked list
		// adding or removing from LAST node is O(1) for array list
		list.addLast(1);  // addFirst and addLast methods specific to linkedlist
		list.addLast(10);
		list.addLast(5);
		list.addLast(3);
		
		list.add(4, 13);
		System.out.println(list.get(4));  // not index based , logic is implemented separately for whole linear search to get item
		
		list.addFirst(7);
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(9);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		for(Integer num : list)
			System.out.println(num);

	}

}
