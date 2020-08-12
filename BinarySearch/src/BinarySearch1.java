
public class BinarySearch1 {

	public static int solution(int[] arr, int k) {

		int high = arr.length - 1;
		int low = 0;
		int mid = 0;

		while (low <= high) {
			mid = (high + low) / 2;

			if (k > arr[mid]) {
				low = mid + 1;
			} else if (k < arr[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 7, 8, 11, 13, 15 };
		int k = 15;
		System.out.println(solution(arr, 15));

	}

}
