/**
 * 
 */
package jpu2016.hit;

import static org.junit.Assert.*;


/**
 * @author thoma

 */
public class HitTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link jpu2016.hit.Hit#getStrength()}.
	 */
	@Test
	public void testGetStrength() {
		final int expected = 1; 
		final Hit hit = new Hit(1, 10, TypeHit.NORMAL); 
		  assertEquals(expected, hit.getStrength())
	}

	/**
	 * Test method for {@link jpu2016.hit.Hit#getRange()}.
	 */
	@Test
	public void testGetRange() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link jpu2016.hit.Hit#getTypeHit()}.
	 */
	@Test
	public void testGetTypeHit() {
		fail("Not yet implemented");
	}

}
