package com.luv4krsna.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		

		Queue<String> queue = new LinkedList<>();
		
//		Queue<String> qu = new ArrayDeque<>();
//		Deque<String> qu2 = new ArrayDeque<>();
		
		
		
		// FIFO - O(1) peek,poll,offer,remove
		queue.add("Adam");
		queue.add("Kevin");
		queue.add("Ana");
		queue.add("Katy");
		queue.offer("Ram");
		System.out.println(queue.peek()); // return F
		queue.poll(); // delete F
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove()); // print and remove F
		}
		
	}

}
