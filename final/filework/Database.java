package filework;

import java.util.List;

import passmanager.Account;

public interface Database {

	void addAccount(Account account);

	List<Account> getAccount();

	void removeAccount(String user); // ? maybe by site

}
