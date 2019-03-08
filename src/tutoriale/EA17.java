package tutoriale;

import java.util.Arrays;

public class EA17 {

	public static int[] removeDuplicates(int[] arr) {
		int length = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			int currElem = arr[i];
			if (currElem != arr[i - 1]) {
				length++;
			}
		}
		int[] noDup = new int[length + 1];
		length = 0;
		for (int i = 1; i < arr.length; i++) {
			int currElem = arr[i];
			if (currElem != arr[i - 1]) {
				noDup[length] = arr[i - 1];
				length++;
			}
		}

		if (arr.length == 0) {
			return new int[0];
		} else if (arr.length == 1) {
			return arr;
		}
		noDup[length] = arr[arr.length - 1];
		return noDup;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1 })));
	}

}
