class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
public class LinkedListUse
{
    public static void main(String args[])
    {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.print(n1.data+" "+n2.data+" "+n3.data+" "+n4.data);
   }
}

//Using Generics

class Node<T>
{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data = data;
    }
}
public class LinkedListUse
{
    public static void main(String args[])
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.print(n1.data+" "+n2.data+" "+n3.data+" "+n4.data);
   }
}

//Making user-defined Print function

class Node<T>
{
    T data;
    Node<T> next;
    public Node(T data)
    {
        this.data=data;
    }
}
public class MyClass
{
    public static Node<Integer> createLL()
    {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void print(Node<Integer> head)
    {
        System.out.print(head.data);
    }
    public static void main(String args[])
    {
        Node<Integer> head=createLL();
        print(head);
    }
}

//Printing complete Linked List

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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]) 
    {
        Node head=LinkedList();
        printLL(head);
    }
}