package collection.revision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsRevision {

	public static void main(String[] args) {
		// Hash set doesn't retain order
		// linked hash set remembers the order you added items in
		// tree sets sorts items in natural order

		Set<String> hashSet1 = new HashSet<String>();
		System.out.println("hash set isEmpty: " + hashSet1.isEmpty() + "\n");
		hashSet1.add("dog");
		hashSet1.add("cat");
		hashSet1.add("cow");
		hashSet1.add("bear");

		System.out.println("HashSet" + hashSet1 + "\n");
		System.out.println("Iterating through HashSet\n");

		for (String element : hashSet1) {
			System.out.println(element);
		}

		Set<String> hashSet2 = new HashSet<String>();
		hashSet2.add("dog2");
		hashSet2.add("cat2");
		hashSet2.add("cow2");
		hashSet2.add("bear");

		Set<String> intersection = new HashSet<String>(hashSet1);
		intersection.retainAll(hashSet2);
		System.out.println("Intersection: " + intersection + "\n");

		Set<String> difference = new HashSet<String>(hashSet1);
		difference.removeAll(hashSet2);
		System.out.println("difference: " + difference + "\n");

		// LinkedHashSet retain order
		Set<String> linkedHshSet = new LinkedHashSet<String>();

		linkedHshSet.add("dog");
		linkedHshSet.add("cat");
		linkedHshSet.add("cow");
		linkedHshSet.add("bear");
		System.out.println("LinedList" + linkedHshSet + "\n");

		// TreeSet sorts in natural order
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("dog");
		treeSet.add("cat");
		treeSet.add("cow");
		treeSet.add("bear");
		System.out.println("TreeSet" + treeSet + "\n");


		if (linkedHshSet.contains("cat"))
			System.out.println("linked hashList contains cat" + "\n");

	}

}
