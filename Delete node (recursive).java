public class Solution
{
    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int i)
    {
        if(i == 0)
        {
		return head.next;
	} 
	if(head.next == null)
        {
		return head;
	}
	head.next = deleteNodeRec(head.next, i - 1);
	return head;
    }
}