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
        //Node n4=new Node(2);
        n1.next=n2;
        n2.next=n3;
        //n3.next=n4;
        return n1;
    }
    public static void countLL(Node head)
    {
	Node temp=head;
        int count=0;
	while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.print(count);
    }
    public static void main(String args[]) 
    {
        Node head=LinkedList();
        countLL(head);
    }
}