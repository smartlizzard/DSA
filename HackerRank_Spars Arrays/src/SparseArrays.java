
public class SparseArrays {
	/*
	 * https://www.hackerrank.com/challenges/sparse-arrays/problem
	 */

	static int[] matchingStrings(String[] strings, String[] queries) {

		int arr[] = new int[strings.length];
		
		for (int i = 0; i < queries.length; i++) {
			int count = 0;
			for (int j = 0; j < strings.length; j++) {
				//if (strings[i].charAt(i) == queries[j].charAt(j)) {
				
					if (queries[i].equals (strings[j])) {
						
					count++;
				}
			}
			arr[i] = count;
		}

		return arr;

	}
	public static void main(String[] args) {
		String[] strings = { "def", "de", "fgh" };
		String[] queries = { "de", "lmn", "fgh" };

		int arr[] = new int[strings.length];
		arr = matchingStrings(strings, queries);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
