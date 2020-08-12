
public class Repeated_String {

	static long repeatedString(String s, long n) {
		long count = 0;
		long r = 0;
		long c = 0;
		long d=0;
		long e=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count = count + 1;
				;
			}
		}
		System.out.println(count);
		c = n/s.length();
		d = c *count;
		r = n % s.length();
		for (int i = 0; i < r; i++) {
			if (s.charAt(i) == 'a') {
				e= e+1;
			}
		}
		System.out.println(e);
		return d+e;
	}

	public static void main(String[] args) {
		String s = "aba";
		long n = 10;

		System.out.println(repeatedString(s, n));
	}
}
