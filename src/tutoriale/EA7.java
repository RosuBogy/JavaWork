package tutoriale;

public class EA7 {

	public static int nthSmallest(int[] sir, int n) {
		int l = sir.length;

		if (n > sir.length) {
			return -1;
		}
		for (int i = 0; i < l; i++) {
			for (int j = 1; j < sir.length - 1; j++) {
				if (sir[j - 1] > sir[j]) {
					int temp = sir[j - 1];
					sir[j - 1] = sir[j];
					sir[j] = temp;
				}
			}
		}

		return sir[n - 1];
	}

	public static void main(String[] args) {

		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 3));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 0, 4, 9 }, 2));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 6));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 7));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 0, 4, 9 }, 1));
	}

}
