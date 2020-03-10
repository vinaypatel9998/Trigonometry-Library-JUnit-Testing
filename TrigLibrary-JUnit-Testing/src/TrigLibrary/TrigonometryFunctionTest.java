package TrigLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @version 2.0
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
	public void powerTest()
	{
		double pow=TrigonometryFunction.power(3,-1);
		assertEquals(Math.pow(3, -1), pow, "Function failed to calculate negative power");
	}
	
	@Test
	public void factorialTest()
	{
		double fact=TrigonometryFunction.factorial(5);
		assertEquals(120,fact,0);
	}
	
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
		assertEquals(Math.sin(60),TrigonometryFunction.sinTrig(60), "Error..!! Input can't be degree");
	}
	
	@Test
	public void cosTest2()
	{
		assertEquals(Math.cos(60),TrigonometryFunction.cosTrig(60), "Error..!! Input can't be degree");
	}
	
	@Test
	public void tanTest2()
	{
		assertEquals(Math.tan(60),TrigonometryFunction.tanTrig(60), "Error..!! Input can't be degree");
	}
	
	@Test
	public void sinTest3()
	{
		assertEquals(Math.sin(90),TrigonometryFunction.sinTrig(90), "Error..!! Input can't be degree");
	}
	
	@Test
	public void cosTest3()
	{
		assertEquals(Math.cos(90),TrigonometryFunction.cosTrig(90), "Error..!! Input can't be degree");
	}
	
	@Test
	public void tanTest3()
	{
		assertEquals(Math.tan(90),TrigonometryFunction.tanTrig(90), "Error..!! Input can't be degree");
	}
}
