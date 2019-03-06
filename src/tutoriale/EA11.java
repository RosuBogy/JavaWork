package tutoriale;

public class EA11 {

	public static boolean isUnique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; i < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isUnique(new int[] { 1, 1, 1 }));
		System.out.println(isUnique(new int[] { 1, 6, 98, 6, 4, 3 }));
		System.out.println(isUnique(new int[] { 8, 2, 7, 9, 3, 5 }));
		System.out.println(isUnique(new int[] {}));
		System.out.println(isUnique(new int[] { 2 }));
	}

}
