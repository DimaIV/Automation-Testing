
public class AdminUserImpl extends AbstractUser implements IAdminUser {
	private static final int NUMBER_OF_USERS = 10;
	private int numberOfUsers;
	private DataBase adminDataBase;

	public AdminUserImpl() {
		this.numberOfUsers = NUMBER_OF_USERS;
		this.adminDataBase = new DataBase(this.numberOfUsers);
		this.setAdmin(true);
	}

	@Override
	public void deleteUser(String username) {
		IUser[] users = this.adminDataBase.getUsers();
		if (isDBEmpty(users)) {
			System.out.println("Empty database!");
		} 
		int indexOf = isUsernameExist(username, users);
		if (indexOf == -1) {
			System.out.println("No such user" );
		} else {
			users[indexOf] = null;
			System.out.println("You have successfully delete user " + username);
		}
	}

	@Override
	public IUser createUser(String username, boolean isAdmin) {
		IUser user = isAdmin ? new AdminUserImpl() : new UserImpl();
		IUser[] users = this.adminDataBase.getUsers();

		if ((isUsernameExist(username, users) == -1)) {
			addUser(users, user, username);
			return user;
		} else {
			System.out.printf("There is a user with such username %1s!%n", username);
			return null;
		}
	}

	@Override
	public void printAllUsers() {
		System.out.println("Printing all users info: ");
		IUser[] users = this.adminDataBase.getUsers();
		if (isDBEmpty(users)) {
			System.out.println("Empty database! You cannot delete anything.");
		}

		for (int i = 0; i < users.length; i++) {
			if (users[i] != null) {
				System.out.printf("Username : %1s%n" 
			+"Registration date: %2s%n"
			+ "Is Admin: %3s%n", users[i].getUsername(),
						users[i].getRegisterDate(), ((AbstractUser)users[i]).isAdmin());
			} else {
			System.out.println("Empty");
			}
		}
	}


	private boolean isDBEmpty(IUser[] users) {
		boolean empty = true;

		for (int i = 0; i < users.length; i++) {
			if (users[i] != null) {
				empty = false;
				break;
			}
		}

		return empty;
	}

	private void addUser(IUser[] users, IUser user, String username) {
		if (this.numberOfUsers != 0) {
			for (int i = 0; i < users.length; i++) {
				if (users[i] == null) {
					user.setUsername(username);
					users[i] = user;
					this.numberOfUsers -= 1;
					return;
				} else {
					continue;
				}
			}
		}
		System.out.println("There is not place for more users.");
	}

	private int isUsernameExist(String username, IUser[] users) {
		int indexOf = -1;
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && (users[i].getUsername().equals(username))) {
				indexOf = i;
				break;
			}
		}
		return indexOf;
	}
}
