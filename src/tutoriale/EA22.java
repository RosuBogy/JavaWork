package tutoriale;

public class EA22 {

	public static int stringSum(String input) {

		int suma = 0;

		if (input.length() == 0) {
			return 0;
		}
		input = input.replaceAll(" ", "");

		String[] operanzi = input.split(",");

		for (String numere : operanzi) {
			suma += Integer.parseInt(numere);
		}

		return suma;
	}

	public static void main(String[] args) {
		System.out.println(stringSum(""));
		System.out.println(stringSum(" 6, 11"));
		System.out.println(stringSum("45, -2"));
	}

}
