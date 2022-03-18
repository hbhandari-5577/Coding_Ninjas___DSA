public class Solution
{
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> prev = null;
        while(current != null)
        {
            LinkedListNode<Integer> temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head)
    {
        head = reverse(head);
        int carry =1,num;
        LinkedListNode<Integer> ptr=head, prev=null;
        while(ptr != null)
        {
            num = ((ptr.data)+carry)%10;
            carry = ((ptr.data)+carry)/10;
            ptr.data = num;
            prev=ptr;
            ptr = ptr.next;
        }
        if(carry == 1)
        {
            LinkedListNode<Integer> tail = new LinkedListNode<Integer>(carry);
            prev.next = tail;
        }
        return reverse(head);
    }
}