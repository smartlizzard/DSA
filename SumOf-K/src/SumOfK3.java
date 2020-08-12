
public class SumOfK3 {
	
	public static boolean sumOf(int []arr, int target) {
		int p1=0;
		int p2=arr.length-1;
		
		while(p1<p2) {
			if(arr[p1]+arr[p2]==target) {
				return true;
			}else if(arr[p1]+arr[p2] >=target) {
				p2--;
				
			}else {
				p1++;
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
