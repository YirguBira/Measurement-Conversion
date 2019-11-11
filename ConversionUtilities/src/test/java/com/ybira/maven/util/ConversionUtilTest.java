package com.ybira.maven.util;
import org.junit.Test;

public class ConversionUtilTest extends junit.framework.TestCase{
	
	private ConversionUtil conversion;

	@Override
//	@Before
	protected void setUp() throws Exception {
		super.setUp();
		conversion = new ConversionUtil();
	}

	@Test
	public void testConvertKMToMile() {
//		fail("Not yet implemented");
		double actual=conversion.convertKMToMile(4);
	    assertEquals(2.48548,actual,0.001);
		
	}

	@Test
	public void testConvertkmToYard() {
//		fail("Not yet implemented");
		double actual=conversion.convertkmToYard(4);
	    assertEquals(4374.45,actual,0.10);
	}

	@Test
	public void testConvertMToMile() {
//		fail("Not yet implemented");
		double actual=conversion.convertMToMile(4000);
	    assertEquals(2.48548,actual,0.001);
	}

	@Test
	public void testConvertMtoYard() {
//		fail("Not yet implemented");
		 double actual=conversion.convertMtoYard(4000);
		 assertEquals(4374.45,actual,0.10);
	}

	@Test
	public void testConvertKgToLb() {
//		fail("Not yet implemented");
	}

	@Test
	public void testConvertKGToOz() {
//		fail("Not yet implemented");
	}

	@Test
	public void testConvertGramToLb() {
//		fail("Not yet implemented");
	}

	@Test
	public void testConvertGramtoOz() {
//		fail("Not yet implemented");
	}
	
	@Override
//	@After
	public void tearDown() throws Exception {	
		super.tearDown();
//		tearDown();
		conversion = null;
	}

}
