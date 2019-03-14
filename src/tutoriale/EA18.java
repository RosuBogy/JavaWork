package tutoriale;

import java.util.Arrays;

public class EA18 {

	public static int countSums(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		pairs: for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				for (int k = j + 1; k < i; k++) {
					if ((arr[j] + arr[k]) == arr[i]) {
						count++;
						continue pairs;
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
