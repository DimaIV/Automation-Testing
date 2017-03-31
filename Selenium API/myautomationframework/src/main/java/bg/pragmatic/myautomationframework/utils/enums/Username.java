/**
 * 
 */
package bg.pragmatic.myautomationframework.utils.enums;

/**
 * @author Strahinski
 *
 */
public enum Username {
	ADMIN("admin"),
	TEACHER("ivan"),
	GUEST("maria"),
	SUPERVISOR("joro"),
	NON_EXISTING_USER("sdafasfdasdf");
	
	private String username;
	
	private Username(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
	
	
}
