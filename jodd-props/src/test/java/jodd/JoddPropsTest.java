package jodd;

import junit.framework.TestCase;

public class JoddPropsTest extends TestCase {

	public void testLoadedModules() {
		assertEquals(false, Jodd.isJoddBeanLoaded());
		assertEquals(false, Jodd.isJoddHttpLoaded());
		assertEquals(false, Jodd.isJoddMadvocLoaded());
		assertEquals(false, Jodd.isJoddMailLoaded());
		assertEquals(false, Jodd.isJoddPetiteLoaded());
		assertEquals(true, Jodd.isJoddPropsLoaded());
		assertEquals(false, Jodd.isJoddProxettaLoaded());
		assertEquals(false, Jodd.isJoddServletLoaded());
		assertEquals(false, Jodd.isJoddUploadLoaded());
		assertEquals(false, Jodd.isJoddVtorLoaded());
	}
}
