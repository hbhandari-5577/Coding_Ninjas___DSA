public class Solution
{
    public static boolean checkSequence(String a, String b)
    {
        if(a.length()==0)
        {
            return true;
        }
        int m=a.length();
        int n=b.length();
        return isSubSequene(b,a,n,m);
    }
    public static boolean isSubSequene(String s1,String s2,int m,int n)
    {
        if(m==0)
        {
            return true;
        }
        if(n==0)
        {
            return false;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return isSubSequene(s1,s2,m-1,n-1);
        }
        return isSubSequene(s1,s2,m,n-1);
    }
}