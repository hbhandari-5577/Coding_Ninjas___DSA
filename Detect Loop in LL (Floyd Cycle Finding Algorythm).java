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
    public static void loop(Node head)
    {
        Node temp_1=head,temp_2=head;
        int flag=0;
        while(temp_1!=null && temp_2!=null && temp_2.next!=null)
        {
            temp_1=temp_1.next;
            temp_2=temp_2.next.next;
            if(temp_1==temp_2)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("Loop found");
        }
        else
        {
            System.out.print("Loop not found");
        }
    }
    public static void main(String args[])
    {
        Node head=scanLL();
        head.next.next.next.next=head;   /*Create loop for testing */
        loop(head);
    }
}