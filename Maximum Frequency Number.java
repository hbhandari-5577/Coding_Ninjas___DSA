import java.util.HashMap;
public class Solution
{
    public static int maxFrequencyNumber(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else if(map.containsKey(arr[i]))
            {
                int old_freq=map.get(arr[i]);
                int new_freq=old_freq+1;
                map.put(arr[i],new_freq);
            }
        }
        int maxCount=Integer.MIN_VALUE;
        int maxValue=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>maxCount)
            {
                maxValue=arr[i];
                maxCount=map.get(arr[i]);
            }
        }
        return maxValue;
    }
}