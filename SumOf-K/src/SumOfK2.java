
public class SumOfK2 {
	
	public static  boolean sumOf(int [] arr, int target) {
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {1,3,5,6,7,9,11};
	      int target=20;
	     System.out.println(sumOf(arr,target));

	}

}
