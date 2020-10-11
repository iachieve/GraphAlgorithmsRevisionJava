import java.util.HashMap;
import java.util.Map;

public class test {

	public static Map<Integer, Integer> memoizeTable = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		int dynamicSol = dynamicSolution(5);
		System.out.println("dynamic solution:" + dynamicSol);
		System.out.println(memoizeTable);
	}

	private static int dynamicSolution(int n) {
		memoizeTable.put(0, 0);
		memoizeTable.put(1, 1);
		if (memoizeTable.containsKey(n))
			return memoizeTable.get(n);
		memoizeTable.put(n - 1, dynamicSolution(n - 1));
		memoizeTable.put(n - 2, dynamicSolution(n - 2));
		int calculatedNumber = memoizeTable.get(n - 1) + memoizeTable.get(n - 2);
		return calculatedNumber;
	}
}
