package filework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import passmanager.Account;

public class FileDatabase implements Database {

	private List<Account> accounts = new ArrayList<>();

	@Override
	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println(account);

	}

	@Override
	public List<Account> getAccount() {
		return accounts;
	}

	@Override
	public void removeAccount(String user) {
		Iterator<Account> iterator = accounts.iterator();

		while (iterator.hasNext()) {
			Account s = iterator.next();
			if (s.getUser().equals(user)) {
				iterator.remove();
			}
		}

	}

}
