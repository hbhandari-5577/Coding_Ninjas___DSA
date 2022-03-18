public class Solution
{
    public static int minCount(int n)
    {
        int minSquaresRequired[] = new int[n + 1];
        minSquaresRequired[0] = 0;
        minSquaresRequired[1] = 1;
        for(int i = 2; i <= n; ++i)
        {
            minSquaresRequired[i] = Integer.MAX_VALUE;
            for(int j = 1; i - (j * j) >= 0; ++j)
            {
                minSquaresRequired[i] = Math.min(minSquaresRequired[i], minSquaresRequired[i - (j * j)]);
            }
            minSquaresRequired[i] += 1;
        }
        return minSquaresRequired[n];
    }
}