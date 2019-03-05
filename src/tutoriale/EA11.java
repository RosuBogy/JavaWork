package tutoriale;

public class EA11 {

	public static boolean isUnique(int[] arr) {
		int l = arr.length - 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[l]) {
				l--;
				return false;
			} else if (arr[i] == arr[i + 1]) {
				return false;
			}

		}
		return true;

	}

	}

	public static void main(String[] args) {
		System.out.println(isUnique(new int[] { 1, 1, 1 }));
		System.out.println(isUnique(new int[] { 1, 6, 98, 3, 4, 6 }));
		System.out.println(isUnique(new int[] { 8, 2, 7, 9, 3, 5 }));
		System.out.println(isUnique(new int[] {}));
		System.out.println(isUnique(new int[] { 2 }));
	}

}
