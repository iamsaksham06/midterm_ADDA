package midterm_20MIC0003;

import static org.junit.Assert.*;
import org.junit.Test;

public class UserAuthenticationTest {

	@Test
	public void testAuthenticate() {
		assertTrue(UserAuthentication.authenticate("myname","myID"));
		assertFalse(UserAuthentication.authenticate("wrongname","wrongID"));
		}
	}