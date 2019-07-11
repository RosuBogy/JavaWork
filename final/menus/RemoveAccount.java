package menus;

import filework.Database;
import keyboard.Keyboard;
import passmanager.PasswordManagerSession;
import passmanager.Security;

public class RemoveAccount extends MenuItem {

	Security secure = new Security();

	public RemoveAccount(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = PasswordManagerSession.getInstance().getKeyboard();
		Database db = PasswordManagerSession.getInstance().getDatabase();

		String site = keyboard.getString("Site: ");
		String user = keyboard.getString("User: ");
		db.removeAccount(user, site);

	}

}
