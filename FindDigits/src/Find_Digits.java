
public class Find_Digits {
	
	
	static int findDigits(int n) {
     int num=n;
     int count=0;
     
     while(n>0) {
    	 int r=n%10;
    	 if(r!=0 && num%r==0) {
    		 count++;
    	 }
    	 n=n/10;
     }
    
		
		return count;
    }


	public static void main(String[] args) {
		System.out.println(findDigits(1012));

	}

}
