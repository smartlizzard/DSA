
public class ClaculateFrequency {

	public static void frequency(String s) {

		char ch = 'a';
		for (int i = 1; i <= 26; i++) {
			// System.out.println(ch);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (ch == s.charAt(j)) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(ch + "--" + count);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			ch++;
		}
	}

	public static void main(String[] args) {
		String s = "aaabbbbccc";
		frequency(s);

	}

}