package testcurs;

public class Combinari {

	public static void combinations(String s, int n) {
		if (s.length() == n) {
			System.out.println(s);
		}
		for (int i = 0; i < s.length(); i++) {
			if (n > 0) {
				combinations(s.substring(i), n - 1);
			}

		}

	}

	public static void main(String[] args) {
		combinations("abc", 2);
	}
}
