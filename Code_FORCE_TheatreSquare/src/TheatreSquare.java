import java.util.Scanner;

public class TheatreSquare {
	/*
	 * https://codeforces.com/problemset/problem/1/A
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextInt();
		long n = sc.nextInt();
		long a = sc.nextInt();

		long countm = m / a;
		long countn = n / a;

		if (m % a != 0) {
			countm++;
		}
		if (n % a != 0) {
			countn++;
		}

		System.out.println(countm * countn);
	}

}
