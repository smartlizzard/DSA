import java.util.Scanner;

/**
 * 
 */

/**
 * @author JITU https://codeforces.com/problemset/problem/158/A
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int playres[] = new int[n];
		for (int i = 0; i < n; i++) {
			playres[i] = sc.nextInt();
		}
		int score = k - 1;
		int playersCount = 0;
		for (int i = 0; i < n; i++) {
			if (playres[i] >= playres[score] && playres[i] != 0) {
				playersCount++;
			}
		}
		System.out.println(playersCount);
	}

}
