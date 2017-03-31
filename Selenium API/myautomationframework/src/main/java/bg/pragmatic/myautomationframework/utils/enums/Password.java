package bg.pragmatic.myautomationframework.utils.enums;

public enum Password {

	ADMINPASS("parola"),
	TEACHERPASS("blabla"),
	GUESTPASS("afdsadfasdf"),
	SUPERVISORPASS("asdfasdfadfs"),
	NON_EXISTIN_PASS("dsfasdfasfasfdafds");
	
	private String password;
	
	private Password(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
}
