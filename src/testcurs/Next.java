package testcurs;

public class Next {

	public static int next(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n && i != arr.length - 1) {
				return arr[i + 1];
			} else if (arr[i] == n && i == arr.length - 1) {
				return -1;
			}
		}

		return -2;
	}

	public static void main(String[] args) {
		System.out.println(next(new int[] { 1, 2, 3, 5 }, 222));
	}
}
