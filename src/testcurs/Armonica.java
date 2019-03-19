package testcurs;

public class Armonica {

	public static double harmonicAvg(int a, int b) {
		if (a + b == 0) {
			return 0;
		}

		return (2 * a * b) / (a + b);
	}

	public static void main(String[] args) {
		System.out.println(harmonicAvg(10, 20));
		System.out.println(harmonicAvg(10, -10));
		System.out.println(harmonicAvg(5, 4));
		System.out.println(harmonicAvg(6, 4));
	}

}
