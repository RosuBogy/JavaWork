package tutoriale;

public class EA16 {

	public static int countAppearances(int[] a, int[] b) {
		int count = 0;

		for (int i = 0; i <= a.length - b.length; i++) {
			int result = 0, j = 0;
			for (int elemB : b) {
				if (a[i + j] == elemB) {
					result++;
					j++;
				}
				if (result == b.length && b.length > 0) {
					count++;
				}
			}
		}
		return count;
	}
}
