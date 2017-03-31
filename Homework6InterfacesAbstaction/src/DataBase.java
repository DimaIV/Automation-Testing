
public class DataBase {
	private IUser[] users;
	private int numberOfUsers;

	public DataBase(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
		this.users = new IUser[this.numberOfUsers];
	}

	public IUser[] getUsers() {
		return users;
	}

}
