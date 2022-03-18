class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class MyClass
{
    public static void main(String args[])
    {
        Node n1=new Node(10);
        System.out.println(n1);
        System.out.println(n1.data);
        System.out.println(n1.next);
    }
}

//Using Generics

class Node<T>
{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data=data;
    }
}
public class MyClass
{
    public static void main(String args[])
    {
        Node<Integer> n1=new Node(10);
        System.out.println(n1);
        System.out.println(n1.data);
        System.out.println(n1.next);
    }
}