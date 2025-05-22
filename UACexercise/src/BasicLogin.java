
public class BasicLogin implements ILogin {
	private String usernme;
	private String password;
	
	public BasicLogin(String username, String password) {
		this.usernme = username;
		this.password = password;
	}

	@Override
	public boolean authenticate(String un, String pass) {
		return (usernme.equals(un) && password.equals(pass));
	}

}
