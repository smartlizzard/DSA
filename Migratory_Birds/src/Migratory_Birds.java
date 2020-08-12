import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Migratory_Birds {

	public static int migratoryBirds(List<Integer> list) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = 0;
		int max_r = 0;
		for (int i = 0; i < list.size(); i++) {
			Integer key = list.get(i);

			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);

			} else {
				map.put(key, 1);
			}
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println("key"+m.getKey()+"---"+ m.getValue());
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > max_r) {
				result = m.getKey();
				max_r = m.getValue();
			}
		}
		return result;
		
		
		
		
		
	}

	


	public static void main(String[] args) {
     List<Integer> list = new ArrayList<Integer>();
     list.add(1);
     list.add(4);
     list.add(4);
     list.add(4);
     list.add(5);
     list.add(3);
     //list.add(3);
    // list.add(1);
     //list.add(3);
     //list.add(4);
     //1 4 4 4 5 3
     System.out.println(migratoryBirds(list));
	}

}
