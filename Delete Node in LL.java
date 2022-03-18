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
    public static Node deleteNode(Node head, int pos)
    {
        if(pos==0)
        {
            head=head.next;
            return head;
        }
        else
        {
            int count=0;
            Node prev=head;
            while(count<pos-1 && prev.next!=null)
            {
                count++;
                prev=prev.next;
            }
            if(prev.next!=null)
            {
                prev.next=prev.next.next;
            }
            return head;
        }
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
        head=deleteNode(head,600);
        printLL(head);
    }
}