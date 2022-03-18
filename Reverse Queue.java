import java.util.LinkedList;
import java.util.Queue;
public class Solution 
{
    public static void reverseQueue(Queue<Integer> q)
    {
	    if(q.isEmpty())
            {
	        return;
	    }
	    int a=q.poll();
	    reverseQueue(q);
	    q.add(a);
    }
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<Integer>();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            q.add(arr[i]);
        }
        reverseQueue(q);
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
    }
}