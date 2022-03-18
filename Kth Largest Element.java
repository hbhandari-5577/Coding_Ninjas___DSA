import java.util.PriorityQueue;
public class Solution
{
    public static int kthLargest(int n, int[] input, int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < k; i++)
        {
            minHeap.add(input[i]);
        }
        for(int i = k; i < n; i++)
        {
            if(input[i] > minHeap.peek())
            {
                minHeap.poll();
                minHeap.add(input[i]);
            }
        }
        return minHeap.peek();
    }
}