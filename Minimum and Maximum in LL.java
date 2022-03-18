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
    public static int min(Node head)
    {
        Node min=head,current=head;
        int minimum=head.data;
        while(current!=null)
        {
            if(minimum>current.data)
            {
                minimum=current.data;
            }
            current=current.next;
        }
        return minimum;
    }
    public static int max(Node head)
    {
        Node max=head,current=head;
        int maximum=head.data;
        while(current!=null)
        {
            if(maximum<current.data)
            {
                maximum=current.data;
            }
            current=current.next;
        }
        return maximum;
    }
    public static void main(String args[])
    {
        Node head=scanLL();
        System.out.println("Minimum value in LL -> "+min(head));
        System.out.println("Maximum value in LL -> "+max(head));
    }
}