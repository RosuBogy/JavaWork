package test2;

public class Display {

	private final String[][] DIGITS = { //
			{ //
					" _ ", //
					"| |", //
					"|_|" }, //
			{ //
					"   ", //
					"  |", //
					"  |" }, //

			{ " _ ", " _|", "|_ " }, { " _ ", " _|", " _|" }, { "   ", "|_ ", "  |" }, //
			{ " _ ", "|_ ", " _|" }, { "   ", "|_ ", "|_|" }, { " _ ", "  |", "  |" }, //
			{ " _ ", "|_|", "|_|" }, { " _ ", "|_|", "  |" }, //
			{ "   ", " o ", " o " }, { "   ", "   ", " o " } };

	public void show(String text) {
		for (int row = 0; row < DIGITS[0].length; row++) {
			for (int col = 0; col < text.length(); col++) {
				char ch = text.charAt(col);
				if (ch >= '0' && ch <= '9') {
					int index = ch - '0';
					System.out.print(DIGITS[index][row]);
				} else if (ch == ':') {
					System.out.print(DIGITS[10][row]);
				} else if (ch == '.') {
					System.out.print(DIGITS[11][row]);
				}

			}
			System.out.println();
		}
	}

}
