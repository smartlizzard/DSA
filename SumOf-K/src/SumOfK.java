
public class SumOfK {

	public static void sumOf(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
                      if(arr[i]+arr[j]==target) {
                    	  System.out.println("index are:::----"+i +"--"+j);
                    	  System.out.println("values are::"+arr[i] +"--"+arr[j]);
                      }
			}
		}

	}

	public static void main(String[] args) {
      int arr[]= {1,3,5,6,7,9,11};
      int target=12;
      sumOf(arr,target);
	}

}
