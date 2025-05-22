
public class OAuthLogin implements ILogin {
	private String token;

	public OAuthLogin(String token) {
		this.token = token;
	}

	@Override
	public boolean authenticate(String un, String pass) {
		return token.equals(pass);
	}

}
