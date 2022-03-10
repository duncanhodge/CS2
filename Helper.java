

public class Helper
{
	public static int validatePositiveInteger(String value)
	{
		int tempInt = -1;
		boolean success = true;
		for(int i = 0; i < value.length(); i++)
		{
			char tempC = value.charAt(i);
			if(tempC < 48 || tempC > 57)
			{
				success = false;
				break;
			}
		}
		if(success)
			tempInt = Integer.parseInt(value);
			
		return tempInt;
	}
	
	public static double validatePositiveDouble(String value)
	{
		double tempDouble = -1.0;
		int decimalPointCounter = 0;
		
		boolean success = true;
		for(int i = 0; i < value.length(); i++)
		{
			char tempC = value.charAt(i);
			if(tempC < 48 || tempC > 57)
			{
				if(tempC == 46)
				{
					decimalPointCounter++;
					if(decimalPointCounter > 1)
					{
						success = false;
						break;
					}
				}
				else
				{
					success = false;
					break;
				}
			}
		}
		if(success)
			tempDouble = Double.parseDouble(value);
		
		return tempDouble;
	}
}
