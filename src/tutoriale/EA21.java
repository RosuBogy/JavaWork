package tutoriale;

public class EA21 {
	public static String hangman(String word, String letters) {
		String replacedString = "";

		if (!(word.matches("^[a-z A-Z]*$"))) {
			return null;
		}

		for (int i = 0; i < word.toCharArray().length; i++) {
			if (word.charAt(i) == ' ') {
				replacedString += " ";
				continue;
			}
			boolean check = false;
			for (char replaceLet : letters.toLowerCase().toCharArray()) {
				if (word.toLowerCase().charAt(i) == replaceLet) {
					replacedString += word.charAt(i);
					check = true;
				}

			}
			if (check == false) {
				replacedString += "_";
			}
		}

		return replacedString;
	}

	public static void main(String[] args) {
		System.out.println(hangman("collections", "eio"));
	}

}
