public class solution
{
	public static String removeX(String input)
    {
        if(input.length()==0)
        {
            return input;
        }
        String ans=removeX(input.substring(1));
        String x="";
        if(input.charAt(0)=='x')
        {
            return x+ans;
        }
        else
        {
            return input.charAt(0)+ans;
        }
    }
}
