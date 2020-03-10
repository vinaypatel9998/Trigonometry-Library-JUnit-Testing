package TrigLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @version 4.0
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
	public void powerTest() throws Exception
	{
		double pow=TrigonometryFunction.power(3, 1);
		assertEquals(Math.pow(3, 1),pow,0);
	}
	
	@Test
	public void factorialTest()
	{
		double fact=TrigonometryFunction.factorial(5);
		assertEquals(120,fact,0);
	}
	
	@Test
	public void sinTest1() throws Exception
	{
		assertEquals(Math.sin(1),TrigonometryFunction.sinTrig(1), delta);
	}
	
	@Test
	public void cosTest1() throws Exception
	{
		assertEquals(Math.cos(1),TrigonometryFunction.cosTrig(1), delta);
	}
	
	@Test
	public void tanTest1() throws Exception
	{
		assertEquals(Math.tan(1),TrigonometryFunction.tanTrig(1), delta);
	}
	
	@Test
	public void sinTest2() throws Exception
	{
		assertEquals(0.5,TrigonometryFunction.sinTrig(TrigonometryFunction.degreetoradian(30)), delta);
	}
	
	@Test
	public void cosTest2() throws Exception
	{
		assertEquals(0.8660,TrigonometryFunction.cosTrig(TrigonometryFunction.degreetoradian(30)), delta);
	}
	
	@Test
	public void tanTest2() throws Exception
	{
		assertEquals(0.5773,TrigonometryFunction.tanTrig(TrigonometryFunction.degreetoradian(30)), delta);
	}
	
	@Test
	public void sinTest3() throws Exception
	{
		assertEquals(Math.sin(12),TrigonometryFunction.sinTrig(12), delta);
	}
	
	@Test
	public void cosTest3() throws Exception
	{
		assertEquals(Math.cos(12),TrigonometryFunction.cosTrig(12), delta);
	}
	
	@Test
	public void tanTest3() throws Exception
	{
		assertEquals(Math.tan(12),TrigonometryFunction.tanTrig(12), delta);
	}
}
