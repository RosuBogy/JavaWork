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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((site == null) ? 0 : site.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
