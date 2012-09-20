package jodd;

import junit.framework.TestCase;

public class JoddHttpTest extends TestCase {

	public void testLoadedModules() {
		assertEquals(false, Jodd.isJoddBeanLoaded());
		assertEquals(true, Jodd.isJoddHttpLoaded());
		assertEquals(false, Jodd.isJoddMadvocLoaded());
		assertEquals(false, Jodd.isJoddMailLoaded());
		assertEquals(false, Jodd.isJoddPetiteLoaded());
		assertEquals(false, Jodd.isJoddPropsLoaded());
		assertEquals(false, Jodd.isJoddProxettaLoaded());
		assertEquals(false, Jodd.isJoddServletLoaded());
		assertEquals(true, Jodd.isJoddUploadLoaded());
		assertEquals(false, Jodd.isJoddVtorLoaded());
	}
}
