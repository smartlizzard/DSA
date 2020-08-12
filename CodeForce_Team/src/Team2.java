import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1= br.readLine();
		int n=Integer.parseInt(s1);
		int sum=0;
		 for(int i=0;i<n;i++) {
			 String [] s= br.readLine().split(" ");
			 System.out.println(s[0]);
			 System.out.println(s[1]);
			 System.out.println(s[2]);
			   sum=Integer.parseInt(s[0])+Integer.parseInt(s[1])+Integer.parseInt(s[2]);
				System.out.println(sum);
		 }
		
		//System.out.println(sum);
	}

}
