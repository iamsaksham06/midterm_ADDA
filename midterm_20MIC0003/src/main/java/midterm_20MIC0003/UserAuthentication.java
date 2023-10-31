package midterm_20MIC0003;

public class UserAuthentication {
	private static final String STORED_NAME = "myname";
	private static final String STORED_ID = "myID";
	public static boolean authenticate(String name, String ID) {
		return name.equals(STORED_NAME) && ID.equals(STORED_ID);
		}
}
