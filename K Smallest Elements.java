import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
public class Solution
{
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            pq.add(input[i]);
        }
        for(int i=k;i<n;i++)
        {
            if(input[i] < pq.peek())
            {
                pq.poll();
                pq.add(input[i]);
            }
        }
        ArrayList<Integer> output = new ArrayList<>();
        while(!pq.isEmpty())
        {
            output.add(pq.poll());
        }
        return output;
    }
}