package passmanager;

import menus.AddAccount;
import menus.Menu;

public class PasswordManager {

	Menu mainMenu = new Menu("", "");

	public static void main(String[] args) {
		AddAccount add = new AddAccount("1", "Add");
		add.run();
		add.run();
	}

}
