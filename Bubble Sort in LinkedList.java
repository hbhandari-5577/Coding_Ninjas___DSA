public class Solution
{
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> current = head, index = null;
        int temp=0;
        if(head == null)
        {
            return head;
        }
        else
        {
            while(current != null)
            {
                index = current.next;
               	 while(index != null) 
                 {
                    if(current.data > index.data)
                    {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
               	 }
               	 current = current.next;
            }
        }
        return head;
    }
}