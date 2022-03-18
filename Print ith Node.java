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
    public static Node LinkedList()
    {
        Node n1=new Node(3);
        Node n2=new Node(4);
        Node n3=new Node(5);
        Node n4=new Node(2);
        Node n5=new Node(6);
        Node n6=new Node(1);
        Node n7=new Node(9);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        return n1;
    }
    public static void printIthNode(Node head, int i)
    {
	Node temp=head;
        int count=0,cnt;
        while(temp!=null)
        {
            cnt=count;
            if(cnt==i)
            {
                System.out.print(temp.data);
                break;
            }
            temp=temp.next;
            count++;
        }
    }
    public static void main(String args[]) 
    {
        Node head=LinkedList();
        printIthNode(head,3);
    }
}