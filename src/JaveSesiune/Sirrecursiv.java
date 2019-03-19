package JaveSesiune;

public class Sirrecursiv {

	public static void permutari(String prefix, String s) {
		if (s.length() == 1) {
			System.out.println(prefix + s);
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			permutari("" + prefix + ch, s.substring(0, i) /* + s.substring(i + 1, s.length() */);
		}
	}

	public static void main(String[] args) {
		permutari("", "abc");
	}
}
