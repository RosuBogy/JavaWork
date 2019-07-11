package menus;

import filework.Database;
import keyboard.Keyboard;
import passmanager.PasswordManagerSession;
import passmanager.Security;

public class ViewAccount extends MenuItem {

	Security secure = new Security();

	public ViewAccount(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = PasswordManagerSession.getInstance().getKeyboard();
		Database db = PasswordManagerSession.getInstance().getDatabase();

		String password = keyboard.getString("Password:");

		if (password.contentEquals(secure.getPass())) {
			System.out.println(PasswordManagerSession.getInstance().getDatabase().getAccount().toString());
		} else {
			throw new RuntimeException("Password Incorect!!!!");
		}

	}

}
