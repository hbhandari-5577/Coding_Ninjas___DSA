public class Solution
{
    public static int maxMoneyLooted(int[] houses)
    {
        int n=houses.length;
        if(n==0) // no house
        {
            return 0;
        }
        if(n==1) // only one house
        {
            return houses[0];
        }
        int dp[]=new int[n];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0],houses[1]);
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-1],houses[i]+dp[i-2]);
        }
        return dp[n-1];
    }
}