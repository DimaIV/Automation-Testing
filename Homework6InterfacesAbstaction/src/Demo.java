
public class Demo {

	public static void main(String[] args) {
		IAdminUser adminUser = new AdminUserImpl();
		
		adminUser.deleteUser("maria78");
		
		adminUser.createUser("pesho", false);
		adminUser.createUser("ivancho", false);
		adminUser.createUser("maria78", false);
		adminUser.createUser("pesho", false);
		adminUser.createUser("ivancho", false);
		adminUser.createUser("ivancho1", true);
		adminUser.createUser("ivancho2", false);
		adminUser.createUser("ivancho3", false);
		adminUser.createUser("ivancho4", false);
		adminUser.createUser("ivanch04", true);
		adminUser.createUser("ivancho5", false);
		adminUser.createUser("ivancho6", false);
		adminUser.createUser("ivancho7", false);
		
		adminUser.printAllUsers();
		adminUser.deleteUser("maria78");
		adminUser.printAllUsers();
	}

}
