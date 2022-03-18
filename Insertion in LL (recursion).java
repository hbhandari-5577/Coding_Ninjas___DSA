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
    public static Node insertR(Node head, int ele, int pos)
    {
        if(head==null && pos>0)
        {
            return head;
        }
        if(pos==0)
        {
            Node newNode=new Node(ele);
            newNode.next=head;
            return newNode;
        }
        else
        {
            head.next=insertR(head.next, ele, pos-1);
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
        head=insertR(head,40,3);
        printLL(head);
    }
}