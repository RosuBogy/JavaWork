package tutoriale;

public class nMicAlt {

	public static int nthSmallest(int[] sir, int n) {
		for (int element : sir) {
			int counter = 0;
			for (int element2 : sir) {
				if (element2 < element) {
					counter++;
				}
			}
			if (counter == n - 1) {
				return element;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 3));
	}

}
