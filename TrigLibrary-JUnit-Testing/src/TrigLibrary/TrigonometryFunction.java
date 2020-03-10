package TrigLibrary;

/**
 * @version 3.0
 * @author ASE group-3
 * Sheshan Patel - 110020601
 * Harsh Patel - 110009172
 * Vinaykumar Patel - 110009163
 * 
 * This class is the implementation of the sine,cosine and tangent trigonometry functions using taylor series
 *
 */
public class TrigonometryFunction {
	
	/**
	 * PI is the variable containing the pie value
	 */
	public static final double PI=3.141592; 
	
	/**
	 * This method shows the power function implementation
	 * @param base the number whose power is calculated
	 * @param power the value at the exponential of power
	 * @return the power value
	 * @throws Exception throwing exception for negative power input
	 */
	public static double power(double base, int power) throws Exception
	{
		double ans=1;
		
		if(power==0)
			return 1;
		
		if(power<0)
			throw new Exception("Invalid power input");
		
		for(int i=1;i<=power;i++)
		{
			ans=ans*base;
		}
		return ans;
	}
	
	/**
	 * This method shows the factorial function implementation 
	 * used to find factorial of the passed value
	 * @param fact the number whose factorial is calculated
	 * @return the factorial value
	 */
	public static long factorial(int fact)
	{
		long f=1;
		for(int i=1;i<=fact;i++)
		{
			f=f*i;
		}
		return f;
	}
	
	/**
	 * This method shows the trigonometry Sine function implementation based on taylor series 
	 * @param angle the radian value for which sine is calculated
	 * @return	the value of the sine function
	 * @throws Exception for invalid power input
	 */
	public static double sinTrig(double angle) throws Exception
	{
		double sinvalue=0.0;
		for(int i=1;i<=11;i++)
		{
			sinvalue=sinvalue+(power(-1,i-1)*power(angle,(2*i)-1))/(factorial((2*i)-1));
		}
		return sinvalue;
	}
	
	/**
	 * This method shows the trigonometry Cosine function implementation based on taylor series 
	 * @param angle the radian value for which cosine is calculated
	 * @return	the value of the cosine function
	 * @throws Exception for invalid power input
	 */
	public static double cosTrig(double angle) throws Exception
	{
		double cosvalue=0.0;
		for(int i=0;i<=10;i++)
		{
			cosvalue=cosvalue+(power(-1,i)*power(angle,2*i))/(factorial(2*i));
		}
		return cosvalue;
	}
	
	/**
	 * This method shows the trigonometry Tangent function implementation based on taylor series
	 * @param angle the radian value for which tangent is calculated
	 * @return	the value of the tangent function
	 * @throws Exception for invalid power input
	 */
	public static double tanTrig(double angle) throws Exception
	{
		return (sinTrig(angle)/cosTrig(angle)); 
	}
	
	/**
	 * This method implements the conversion of degree to radian value
	 * @param degree the value to be converted
	 * @return the radian value equivalent to degree
	 */
	public static double degreetoradian(double degree)
	{
		return (degree*PI)/180;
	}
	
}