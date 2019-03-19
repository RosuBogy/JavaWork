package testcurs;

public class Combinari {

	public static void combinations(String s, int n) {
		if (s.length() == n) {
			System.out.println(s);
		}
		String elem;
		for (int i = 0; i < s.length(); i++) {
			System.out.println(combinations(s.substring(0, s.length() - 1), n));
		}

	}

	public static void main(String[] args) {
		combinations("abc", 2);
	}
}
