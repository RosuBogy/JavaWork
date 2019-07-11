package passmanager;

import menus.AddAccount;
import menus.BackMenu;
import menus.Menu;
import menus.MenuItem;
import menus.RemoveAccount;
import menus.ViewAccount;

public class PasswordManager {

	public static void main(String[] args) {
		PasswordManager app = new PasswordManager();
		PasswordManagerSession.getInstance().init();
		app.run();

	}

	private void run() {
		Menu mainMenu = new Menu("", "");

		Menu accounts = new Menu("1", "Manager");
		MenuItem addAccount = new AddAccount("1", "Add Account");
		MenuItem viewAccount = new ViewAccount("2", "View Account");
		MenuItem removeAccount = new RemoveAccount("3", "Remove Account");
		BackMenu back = new BackMenu("0", "Exit");

		accounts.addMenuItem(addAccount);
		accounts.addMenuItem(viewAccount);
		accounts.addMenuItem(removeAccount);
		accounts.addMenuItem(back);
		accounts.setBackAction(back);

		mainMenu.addMenuItem(accounts);
		mainMenu.addMenuItem(back);
		mainMenu.setBackAction(back);
		mainMenu.doAction();

	}

}
