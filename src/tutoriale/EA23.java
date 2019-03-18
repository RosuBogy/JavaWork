package tutoriale;

public class EA23 {
	public static String camelCase(String input) {
		input = input.trim();
		String output = "";
		if (input.length() == 0) {
			return input;
		}

		String[] wordInput = input.split("[ ]");

		for (int i = 0; i < wordInput.length; i++) {
			if (i == 0) {
				output += wordInput[i].substring(0, 1).toLowerCase() + wordInput[i].substring(1).toLowerCase();
			} else {
				output += wordInput[i].substring(0, 1).toUpperCase() + wordInput[i].substring(1).toLowerCase();
			}

		}

		return output;

	}

	public static void main(String[] args) {
		System.out.println(camelCase(" ana are mere"));
	}

}
