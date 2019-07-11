package filework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import passmanager.Account;
import passmanager.PasswordManagerSession;

public class FileDatabase implements Database, Serializable {

	private List<Account> accounts = new ArrayList<>();

	@Override
	public void addAccount(Account account) {
		if (accounts.contains(account)) {
			throw new RuntimeException("Site and user already exists");
		}
		accounts.add(account);
		System.out.println(account);
		PasswordManagerSession.getInstance().getRepository().save(this);

	}

	@Override
	public List<Account> getAccount() {
		return accounts;
	}

	@Override
	public void removeAccount(String user, String site) {
		Iterator<Account> iterator = accounts.iterator();

		while (iterator.hasNext()) {
			Account s = iterator.next();
			if (s.getUser().equals(user) && s.getSite().equals(site)) {
				iterator.remove();
			} else {
				throw new RuntimeException("Account does not exist");
			}
		}
		PasswordManagerSession.getInstance().getRepository().save(this);
	}

}
