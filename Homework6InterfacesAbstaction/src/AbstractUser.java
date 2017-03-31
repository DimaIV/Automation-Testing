import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class AbstractUser implements IUser {
	private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	private LocalDateTime registrationDate = LocalDateTime.now();
	private String username;
	private boolean isAdmin;
	private boolean isLogged;

	@Override
	public void userLogIn() {
		this.isLogged = true;
		System.out.println("You have been successfully logged in!");
	}

	@Override
	public void userLogOut() {
		this.isLogged = false;
		System.out.println("You have been successfully logged out!");
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public void setUsername(String username) {
		if(username != null && !username.equals("")){
		this.username = username;
		}
	}

	@Override
	public String getRegisterDate() {
		this.registrationDate = LocalDateTime.now();
		return dateFormat.format(registrationDate);
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	


}
