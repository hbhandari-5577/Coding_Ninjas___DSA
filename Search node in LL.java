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
    public static int findNode(Node head, int n)
    {
	Node temp=head;
        int count=0,value=-1;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                value=count;
                break;
            }
            count++;
            temp=temp.next;
        }
        return value;
    }
    public static void main(String args[])
    {
        Node head=scanLL();
        System.out.print(findNode(head,1));
    }
}