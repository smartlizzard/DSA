
public class DiagonalDifference2 {

	public static int digonalSum(int[][] arr) {

		int rightSum = 0;
		int leftSum = 0;

		for (int i = 0; i < arr.length; i++) {
			leftSum += arr[i][i];

		}
		for (int j = 0; j < arr.length; j++) {
			rightSum = rightSum + arr[j][arr.length - 1 - j];

		}
		System.out.println(rightSum);
		System.out.println(leftSum);
		return Math.abs(leftSum - rightSum);

	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };
		System.out.println(digonalSum(arr));
	}

}
