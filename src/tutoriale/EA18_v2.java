package tutoriale;

public class EA18_v2 {

	public static int countSums(int[] arr) {
		int count = 0;

		for (int i = 1; i <= arr.length - 1; i++) {
			int sum = arr[i] + arr[i - 1];
			int sum2 = arr[i + 1] + arr[i - 1];
			for (int elm : arr) {
				if (sum == elm || sum2 == elm) {
					count++;
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
