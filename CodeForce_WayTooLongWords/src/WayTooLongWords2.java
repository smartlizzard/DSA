import java.util.Scanner;

public class WayTooLongWords2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String s = "";
		String sout = "";
		for (int i = 0; i <= len; i++) {
			s=sc.nextLine();
			if (s.length() > 10) {
				sout +=s.charAt(0);
				sout += s.length() - 2;
				sout += s.charAt(s.length() - 1);
				System.out.println(sout);
				sout="";

			} else {
				System.out.println(s);
			}
		}

	}

}