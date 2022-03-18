import java.util.*;
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
public class LL
{
    public static Node scanLL()
    {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node head=null,tail=null;
        while(data!=-1)
        {
            Node currentNode=new Node(data); 
            if(head==null)
            {
                head=currentNode;
                tail=currentNode;
            }
            else
            {
                tail.next=currentNode;
                tail=tail.next;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static Node reverse(Node head)
    {
        Node current=head;
        Node prev=null,next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void printLL(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Node head=scanLL();
        head=reverse(head);
        printLL(head);
    }
}

//Using ArrayList

public class Solution
{
    public static int LengthIterative(LinkedListNode<Integer> head)
    {
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
    }
    public static void printReverse(LinkedListNode<Integer> root)
    {
        int length=LengthIterative(root);
        java.util.ArrayList<Integer> list1=new java.util.ArrayList<Integer>(length);
        for(int i=0;i<length;i++)
        {
            list1.add(root.data);
            root=root.next;
        }
        for(int i=length-1;i>=0;i--)
        {
            System.out.print(list1.get(i)+" ");
        }
    }
}