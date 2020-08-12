import java.util.Scanner;

public class Team {

	/*
	 * https://codeforces.com/problemset/problem/231/A
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[][] a = new int[3][3];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
   int sum=0;
   int count=0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 3; j++) {
			      sum=sum+a[i][j];
				   if(sum>=2) {
					   count++;
				   }
			}
			
		}
		System.out.println(count);
	}

}
