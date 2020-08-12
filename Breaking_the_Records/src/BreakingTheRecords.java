
public class BreakingTheRecords {
	
	public static int[] solution(int[] scores) {
		 int result[]=new int[2];
	        int max=scores[0];
	        int min=scores[0];
	        int min_count=0;
	        int max_count=0;

	        for(int i=0;i<scores.length;i++){
	            if(max>scores[i]){
	                max=scores[i];
	                max_count++;
	            }
	           
	        }
	        for(int i=0;i<scores.length;i++){
	            if(min<scores[i]){
	                min=scores[i];  
	                min_count++;
	                }
	            
	            }
		      result[0]=max_count;
		      result[1]=min_count;
		      
		return result;
		
	}
	
	

	public static void main(String[] args) {
		int arr[]= {10,5,20,20,4,5,2,25,1};
		System.out.println(solution(arr)[0]);
		System.out.println(solution(arr)[1]);
		
		
		

	}

}
