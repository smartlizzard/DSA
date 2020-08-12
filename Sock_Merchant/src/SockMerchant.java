import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SockMerchant {

	public static Integer sockMerchant(int[] arr) {
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (set.contains(element)) {
				set.remove(element);
				count++;
			} else {
				set.add(element);
			}
		}

		return count;

	}

	public static Integer sockMerchant2(int[] arr) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			Integer key = arr[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);

			} else {
				map.put(key, 1);
			}
		}
		for (Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println("key" + m.getKey() + "---" + m.getValue());
			
		}
		for (int i : map.values()) {
			count = count + (i / 2);
		}
		return count;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(arr));
		System.out.println(sockMerchant2(arr));
	}

}
