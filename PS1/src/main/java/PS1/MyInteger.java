package PS1;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue)
	{
		this.iValue = iValue;
	}
	
	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven()
	{		
		return MyInteger.isEven(iValue);
	}
	
	public static boolean isEven(int iValue)
	{
		return (iValue % 2 == 0);
	}
	 
	public static boolean isEven(MyInteger myInt)
	{
		return (MyInteger.isEven(myInt.iValue));

	}
	
	
	
	public boolean isOdd()
	{
		return !isEven();
	}
	
	public static boolean isOdd(int iValue)
	{
		return !isEven(iValue);
	}
	 
	public static boolean isOdd(MyInteger myInt)
	{
		return !(MyInteger.isEven(myInt.iValue));

	}
	
	
	public boolean isPrime() 	
	{ 
		return MyInteger.isPrime(iValue);
	}
	
	public static boolean isPrime(int iValue)
	{
		boolean isPrime = true;
		for (int i = 2; i <= (iValue / 2 ); i++)
		{
			if (iValue % i == 0)
			{
				return false;
			}
		}
		return isPrime;
	}
	
	public static boolean isPrime(MyInteger myInt)
	{
		return (MyInteger.isPrime(myInt.iValue));
	}
	
	
	
	public boolean equals(int eValue)
	{
		return (eValue == iValue);
	}
	
	public boolean equals(MyInteger myInt)
	{
		return equals(myInt.getiValue());
	}
	
}




