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
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void printLL(Node head)
    {
	    Node temp=head;
        while(temp!=null)
        {
            System.out.print((++temp.data)+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]) 
    {
        Node head=LinkedList();
        printLL(head);
    }
}

//Increment by user defined function

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
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void incrementLL(Node head)
    {
	Node temp=head;
        while(temp!=null)
        {
            temp.data++;
            temp=temp.next;
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
        Node head=LinkedList();
        incrementLL(head);
        printLL(head);
    }
}