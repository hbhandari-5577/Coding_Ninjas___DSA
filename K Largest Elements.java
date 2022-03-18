import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution
{
    public static ArrayList<Integer> kLargest(int input[], int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<k;i++)
        {
            pq.add(input[i]);
        }
        for(int i=k;i<input.length;i++)
        {
            if(input[i] > pq.peek())
            {
                pq.poll();
                pq.add(input[i]);
            }
        }
        ArrayList<Integer> output = new ArrayList<Integer>();
        while(!pq.isEmpty())
        {
            output.add(pq.poll());
        }
        return output;
    }
}