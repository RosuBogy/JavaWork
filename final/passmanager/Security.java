package passmanager;

public class Security {

	private char key = '&';
	private String password = "1234";

	public String getPass() {
		return password;
	}

	public String encrypt(String info) {
		String secured = "";
		char temp;
		int xor;

		for (int i = 0; i < info.length(); i++) {
			xor = info.charAt(i) ^ key;
			temp = (char) xor;
			secured = secured + temp;
		}
		return secured;
	}

}
