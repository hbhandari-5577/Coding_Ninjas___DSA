public class Solution
{
    public static int i=0;
    public static int findNodeRec(LinkedListNode<Integer> head, int n)
    {
    	if(head==null)
            return -1;
        if(head.data==n)
            return i;  
        i++;
	return findNodeRec(head.next,n);
    }
}