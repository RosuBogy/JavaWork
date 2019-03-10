package tutoriale;

public class EA18 {

	public static int countSums(int[] arr) {
		int count = 0;

		fp: for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] == arr[k]) {
						count++;
						continue fp;
					}
				}

			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countSums(new int[] { 1, 2, 3 }));
		System.out.println(countSums(new int[] { 1, 2, 3, 4 }));
		System.out.println(countSums(new int[] { 1, 1, 2, 3 }));
		System.out.println(countSums(new int[] { 0, 1, 1, 2, 3 }));
		System.out.println(countSums(new int[] {}));
	}

}
