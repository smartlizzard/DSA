
public class PerfectSquare {

	private static int solution(int n) {

		int low = 1;
		int high = n;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;

			if (mid * mid > n) {
				high = mid - 1;
			} else if (mid * mid < n) {
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		System.out.println(solution(81));
	}
}
