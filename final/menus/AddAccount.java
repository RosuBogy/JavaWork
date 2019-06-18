package menus;

import filework.Database;
import keyboard.Keyboard;
import passmanager.Account;
import passmanager.PasswordManagerSession;

public class AddAccount extends MenuItem {

	public AddAccount(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = PasswordManagerSession.getInstance().getKeyboard();
		Database db = PasswordManagerSession.getInstance().getDatabase();

		String site = keyboard.getString("Site: ");
		String user = keyboard.getString("User: ");
		String password = keyboard.getString("Password: ");

		Account account = new Account(site, user, password);
		db.addAccount(account);
	}

}
