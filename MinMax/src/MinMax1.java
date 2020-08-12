
public class MinMax1 {

	public static int min(int[] arr) {
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <min) {
				min = arr[i];
				//return min;
			}
		}
		return min;
	}

	
	public static int max(int arr[]) {
		int max= arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {8, 1, 2, 3, 6, 7,-11, 9 };
		System.out.println(min(arr));
		System.out.println(max(arr));

	}

}
