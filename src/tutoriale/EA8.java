package tutoriale;

public class EA8 {
	public static boolean contains(int[] a, int[] b) {
		int index = 0;

		if (a.length == 0) {
			return false;
		} else if (a.length == 0) {
			return true;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[index]) {
				index++;
				if (index == b.length) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}
}
