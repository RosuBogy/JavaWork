package testcurs;

public class Sortat {

	public static boolean isSorted(int[] arr) {
		int temp = arr[0];

		for (int i = 1; i <= arr.length - 1; i++) {
			if (temp > arr[i] && temp != arr[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSorted(new int[] { 1, 2, -1, 4, 6, 7 }));
	}

}
