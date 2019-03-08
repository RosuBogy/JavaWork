package tutoriale;

import java.util.Arrays;

public class EA17_ver2 {

	public static int[] removeDuplicates(int[] arr) {
		int[] noDup = new int[arr.length];
		int j = 0;
		// int length=0;

		for (int i = 0; i < arr.length - 1; i++) {
			int currElem = arr[i];
			if (currElem != arr[i + 1]) {
				noDup[j] = currElem;
			}
		}
		noDup[j] = arr[arr.length - 1];
		return noDup;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 2, 2, 2, 3, 3, 3, 3 })));
	}

}
