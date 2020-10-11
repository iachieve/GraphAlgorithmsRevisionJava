package collection.revision;

import java.util.HashMap;
import java.util.Map;

public class HashMapsRevision {
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(5, "five");
		hashMap.put(6, "six");
		hashMap.put(7, "seven");

		System.out.println(hashMap.get(5));

		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
	}
}
