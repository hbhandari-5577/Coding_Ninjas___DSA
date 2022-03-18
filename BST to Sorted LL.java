public class Solution
{
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return null;
        }
        LinkedListNode<Integer> head=new LinkedListNode<Integer>(root.data);
        if(root.left==null&&root.right==null)
        {
            return head;
        }        
        else if(root.left!=null&&root.right!=null)
        {
            LinkedListNode<Integer> temp=constructLinkedList(root.left);
            LinkedListNode<Integer> tempp=temp;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=head;
            head.next=constructLinkedList(root.right);
            return tempp;
        }
        else if(root.left!=null)
        {
            LinkedListNode<Integer> temp=constructLinkedList(root.left);
            LinkedListNode<Integer> tempp=temp;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=head;
            return tempp;
        }
        else
        {
            head.next=constructLinkedList(root.right);
            return head;
        }
    }
}