
public class MaxMinSum {

	public static void maxmin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		int maxSum = 0;
		int minSum = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		maxSum = sum - min;
		minSum = sum - max;
		System.out.println(maxSum +"--"+ minSum);
	}

	public static void main(String[] args) {
     int arr[]= {1,3,5,7,9};
     maxmin(arr);
     
	}

}
