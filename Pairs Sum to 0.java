import java.util.*;
public class Solution
{
    public static int PairSum(int[] arr, int n)
    {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int rem=0-arr[i];
            if(mp.containsKey(rem))
            {
                int count=mp.get(rem);
                for(int j=0;j<count;j++)
                {
                    ans++;
                }
            }
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        return ans;
    }
}