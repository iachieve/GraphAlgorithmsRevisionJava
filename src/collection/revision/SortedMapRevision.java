package collection.revision;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapRevision {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		testMap(hashMap, " HashMap");
		testMap(linkedHashMap, " linkedHashMap");
		testMap(treeMap, " TreeMap");
	}

	public static void testMap(Map<Integer, String> map, String type) {
		System.out.println("checking " + type);
		map.put(9, "nine");
		map.put(8, "eight");
		map.put(7, "seven");
		map.put(6, "six");
		map.put(5, "five");
		map.put(4, "four");

		System.out.println("First Iteration");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		System.out.println("Second Iteration");
		for(Integer key: map.keySet()) {
			String val = map.get(key);
			System.out.println(key + " " + val);
		}
		
	}
}
