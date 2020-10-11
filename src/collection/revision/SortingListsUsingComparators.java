package collection.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortingListsUsingComparators {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("elephant is a big animal");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		System.out.println(animals);
		Collections.sort(animals);
		System.out.println(animals);

		List<String> animals2 = new ArrayList<String>();
		animals2.add("cat");
		animals2.add("elephant");
		animals2.add("tiger");
		animals2.add("lion");
		animals2.add("snake");
		animals2.add("mongoose");
		Collections.sort(animals2, new StringLengthComparator());
		System.out.println(animals2);

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(8);
		numbers.add(7);
		System.out.println(numbers);

	}

}
