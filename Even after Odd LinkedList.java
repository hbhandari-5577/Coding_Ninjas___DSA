public class Solution
{
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head)
        {
    		LinkedListNode<Integer> odd = null, oddTail = null;
		LinkedListNode<Integer> even = null, evenTail = null;
		LinkedListNode<Integer> curr = head;
		while (curr != null)
		{
			if ((curr.data & 1) == 0)
			{
				if (odd == null)
                		{
					odd = oddTail = curr;
				}
				else
				{
					oddTail.next = curr;
					oddTail = oddTail.next;
				}
			}
			else
			{
				if (even == null)
                		{
					even = evenTail = curr;
				}
				else
				{
					evenTail.next = curr;
					evenTail = curr;
				}
			}
			curr = curr.next;
		}
		if (even != null)
		{
			head = even;
			evenTail.next = odd;
		}
		else
        	{
			head = odd;
		}
		if (oddTail != null)
        	{
			oddTail.next = null;
		}
		return head;
	}
}