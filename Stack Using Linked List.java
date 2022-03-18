class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
public class StackUsingLL
{
    Node head;
    int size;
    public StackUsingLL()
    {
        head=null;
        size=0;
    }
    public void push(int ele)
    {
        Node n=new Node(ele);
        n.next=head;
        head=n;
        size++;
    }
    public int pop()
    {
        if(size()==0)
        {
            return -1;
        }
        int temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public int peek()
    {
        if(size()==0)
        {
            return -1;
        }
        return head.data;
    }
    public static void main(String args[])
    {
        StackUsingLL s=new StackUsingLL();
        int arr[]={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++)
        {
            s.push(arr[i]);
        }
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
}