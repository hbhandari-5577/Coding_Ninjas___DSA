public class Solution
{
    public static int pairSum(int[] input, int num)
    {
        int i,j,count=0;
	for(i=0;i<input.length;i++)
        {
            for(j=i+1;j<input.length;j++)
            {
                if(num==(input[i]+input[j]))
                {
                    count++;
                }
            }
        }
        return count;
    }
}