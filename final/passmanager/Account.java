package passmanager;

public class Account {

	private String user;
	private String password;
	private String site;

	public Account(String site, String user, String password) {
		super();
		this.site = site;
		this.user = user;
		this.password = password;

	}

	@Override
	public String toString() {
		return "Account [site=" + site + ", user=" + user + ", password=" + password + "]";
	}

	public String getPassword() {
		return password;
	}

	public String getUser() {
		return user;
	}
}
