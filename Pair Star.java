public class solution
{
	public static String addStars(String s)
    {
		if(s.equals("") || s.length() == 1) 
        {
            return s;
        }
  		if(s.charAt(0) == s.charAt(1))
        {
    		return s.charAt(0) + "*" + addStars(s.substring(1));
        }
  		else
        {
    		return s.charAt(0) + addStars(s.substring(1));
        }
	}
}