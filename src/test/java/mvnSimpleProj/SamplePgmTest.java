package mvnSimpleProj;

import static org.junit.Assert.*;

import org.junit.Test;


public class SamplePgmTest {
	@Test
	public void testGreetingMessage() {
		assertEquals("Facebook - Log In or Sign Up", SamplePgm.getTitle());
	}
	

}