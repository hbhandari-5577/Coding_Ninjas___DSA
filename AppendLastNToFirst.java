public class Solution
{
        public static int length(LinkedListNode<Integer> head)
        {
		LinkedListNode<Integer> temp = head;
		int count = 1;
		while (temp.next != null) 
        	{
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> root, int n)
        {
        	int value = length(root) - n;
		LinkedListNode<Integer> temp = root;
		while (temp.next != null)
        	{
			temp = temp.next;
		}
		temp.next = root;
		int count = 0;
		while (count < value) 
        	{
			temp = temp.next;
			count++;
		}
		LinkedListNode<Integer> head = temp.next;
		temp.next = null;
		return head;
        }
}