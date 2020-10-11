package collection.revision;

import java.util.HashMap;
import java.util.Map;

/*
 * Hashmap <key, value>
 * hash map doesn't maintain order 
 */
public class HashMapsRevision {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(5, "five");
		hashMap.put(4, "four");
		hashMap.put(3, "three");
		hashMap.put(2, "two");
		hashMap.put(1, "one");
		System.out.println(hashMap.get(4));

		// iterating over hash map
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println(hashMap.get(100));
	}
}
