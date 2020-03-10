package TrigLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author ASE group-3
 * Sheshan Patel - 110020601
 * Harsh Patel - 110009172
 * Vinaykumar Patel - 110009163
 * 
 * This class test the different angles on User defined functions sin, 
 * cos and tan function with Math library functions
 */
class TrigonometryFunctionTest {

	/**
	 * This variable limits the floating point value check of expected and actual result 
	 */
	double delta=0.01;
	
	@Test
	public void sinTest1()
	{
		assertEquals(Math.sin(1),TrigonometryFunction.sinTrig(1), delta);
	}
	
	@Test
	public void cosTest1()
	{
		assertEquals(Math.cos(1),TrigonometryFunction.cosTrig(1), delta);
	}
	
	@Test
	public void tanTest1()
	{
		assertEquals(Math.tan(1),TrigonometryFunction.tanTrig(1), delta);
	}
	
	@Test
	public void sinTest2()
	{
		assertEquals(Math.sin(30),TrigonometryFunction.sinTrig(30), delta);
	}
	
	@Test
	public void cosTest2()
	{
		assertEquals(Math.cos(30),TrigonometryFunction.cosTrig(30), delta);
	}
	
	@Test
	public void tanTest2()
	{
		assertEquals(Math.tan(30),TrigonometryFunction.tanTrig(30), delta);
	}
}
