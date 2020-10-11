package collection.revision;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRevision {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(5);
		arrayList.get(0);
		arrayList.remove(0);
		System.out.println(arrayList.isEmpty());
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//
//		System.out.println(numbers.get(0));
//
//		System.out.println("iteration #");
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
//
//		System.out.println("#iteration 2");
//		for (Integer value : numbers) {
//			System.out.println(value);
//		}
//
//		System.out.println("removing items");
//		numbers.remove(numbers.size() - 1);
//
//		System.out.println("iteration #3");
//
//		for (Integer number : numbers) {
//			System.out.println(number);
//		}
//
//		System.out.println("List interface");
//		List<String> stringList = new ArrayList<String>();
//		stringList.add("Mohamed");
//		stringList.add("Mostafa");
//		for (String s : stringList) {
//			System.out.println(s);
//		}

	}

}
