package com.luv4krsna.collection;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack<String> names = new Stack<String>(); //peek,pop,push
		
		names.push("Adam");
		names.push("Raj");
		names.push("Ram");
		names.push("krsna");
		names.push("Narsimha");
		
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.peek());  //LIFO - Narsimha - returns L without removing
		System.out.println(names.pop()); //removes L and returns L
		System.out.println(names);
		
		while(!names.isEmpty())
		{
			System.out.println(names.pop());
		}
	}

}
