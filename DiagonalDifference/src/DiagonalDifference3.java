import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference3 {

	public static int digonalSum(List<List<Integer>> arr) {

		int rightSum = 0;
		int leftSum = 0;

		for (int i = 0; i < arr.size(); i++) {
			leftSum += arr.get(i).get(i);
			rightSum = rightSum + arr.get(i).get(arr.size() - 1 - i);

		}

		System.out.println(rightSum);
		System.out.println(leftSum);
		return Math.abs(leftSum - rightSum);

	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);

		List<Integer> list3 = new ArrayList<Integer>();
		list2.add(9);
		list2.add(8);
		list2.add(9);

		List<List<Integer>> list4 = new ArrayList<List<Integer>>();
		list4.add(list1);
		list4.add(list2);
		list4.add(list3);

		System.out.println(digonalSum(list4));
	}

}
