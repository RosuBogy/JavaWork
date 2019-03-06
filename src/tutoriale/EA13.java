package tutoriale;

public class EA13 {

	public static int getMaxTriple(int[] arr) {
		int sumTrip = 0;

		if (arr.length < 4) {
			for (int i = 0; i < arr.length; i++) {
				sumTrip += arr[i];
			}
		}

		for (int i = 0; i <= arr.length - 3; i++) {
			int sum = arr[i] + arr[i + 1] + arr[i + 2];
			if (sumTrip < sum) {
				sumTrip = sum;
			}
		}
		return sumTrip;
	}

	public static void main(String[] args) {
		System.out.println(getMaxTriple(new int[] { 3, 5 }));
	}
}
