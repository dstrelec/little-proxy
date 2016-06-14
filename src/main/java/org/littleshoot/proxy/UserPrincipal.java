package org.littleshoot.proxy;

public class UserPrincipal {
	
	public static final UserPrincipal ANONYMOUS = new UserPrincipal("anonymous", null);

	private String name;
	
	private String password;
	
	public UserPrincipal(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
