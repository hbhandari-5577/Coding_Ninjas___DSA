public class Solution
{
    public static void deleteAlternateNodes(Node<Integer> head)
    {
        Node<Integer> cur = head;
        Node<Integer> curNext;
        while(cur != null && cur.next != null)
        {
            curNext = cur.next;
            cur.next = curNext.next;
            cur = cur.next;
        }
    }
}