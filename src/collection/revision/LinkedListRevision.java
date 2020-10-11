package collection.revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayLists manages arrays internally
 * Add at the end:
 * 				fast in array lists
 * 				slow in linked lists
 * 
 * adding the front
 * 				slow in array lists
 * 				fast in linked list
 * 
 * Linked List consists of elements where 
 * each element has a reference to the previous and next element
 */
public class LinkedListRevision {
	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

//		List<Integer> arrayList = new ArrayList<Integer>();
//		List<Integer> linkedList = new LinkedList<Integer>();
//
//		addItemsAtBegining("ArrayList", arrayList);
//		addItemsAtBegining("LinkedList", linkedList);
//
//		addItemsAtEnd("ArrayList", arrayList);
//		addItemsAtEnd("LinkedList", linkedList);
	}

//	public static void addItemsAtBegining(String type, List<Integer> list) {
//		System.out.println("Adding items at the beginning of the list");
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			list.add(0, i);
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("Time taken: " + (end - start) + " ms for " + type);
//	}
//
//	public static void addItemsAtEnd(String type, List<Integer> list) {
//		System.out.println("Adding items to the end of the list");
//		long start = System.currentTimeMillis();
//
//		for (int i = 0; i < 1000000; i++) {
//
//			list.add(i);
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("Time taken: " + (end - start) + " ms for " + type);
//	}
}
