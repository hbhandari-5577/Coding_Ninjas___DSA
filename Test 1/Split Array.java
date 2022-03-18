public class solution
{
    public static boolean splitArray(int input[])
    {
        int n=input.length;
        return helper(input,n,0,0,0);
    }
    public static boolean helper(int a[],int n,int start,int l,int r)
    {
        if(start==n)
        {
            return l==r;
        }
        if(a[start]%5==0)
        {
            l+=a[start];
        }
        else if(a[start]%3==0)
        {
            r+=a[start];
        }
        else
        {
            return helper(a, n, start+1, l+a[start], r) || helper(a, n, start+1, l, a[start]+r);
        }
        return helper(a, n, start+1, l, r);
    }
}
