public class R
{
    public static String replacePi(String s)
    {
        if(s.length()<=1)
        {
            return s;
        }
        if(s.charAt(0)=='p'&&s.charAt(1)=='i')
        {
            String ans=replacePi(s.substring(2));
            return "3.14"+ans;
        }
        else
        {
            String ans=replacePi(s.substring(1));
            return s.charAt(0)+ans;
        }
    }
    public static void main(String args[])
    {
        String input="pipi";
        R ob=new R();
        System.out.print(ob.replacePi(input));
    }
}