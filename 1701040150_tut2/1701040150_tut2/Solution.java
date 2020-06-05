

import java.math.BigDecimal;
import java.util.*;

public class Solution {

	public static void main(String[] argh) {
		// Input
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number [" + i + "]");
			s[i] = sc.next();
		}

		List<String> numberStringList = Arrays.asList(s);
		Collections.sort(numberStringList, Collections.reverseOrder(new BigDecimalComparator()));

		// Output
		System.out.println("Reordering list: ");
		for (int i = 0; i < n; i++) {
			System.out.println(numberStringList.get(i));
		}

	}

	static class BigDecimalComparator implements Comparator<String> {
		public int compare(String c1, String c2) {
			BigDecimal bigDecA = new BigDecimal(c1);
			BigDecimal bigDecB = new BigDecimal(c2);

			return bigDecA.compareTo(bigDecB);
		}
	}

}