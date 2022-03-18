public class solution
{
	static int convertStringToInt(String str) 
	{
		if (str.length() == 1)
        {
			return (str.charAt(0) - '0');
        }
		double y = convertStringToInt(str.substring(1));
		double x = str.charAt(0) - '0';
		x = x * Math.pow(10, str.length() - 1) + y; 
		return (int)(x); 
	} 
}