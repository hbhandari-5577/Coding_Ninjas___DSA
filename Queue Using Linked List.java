class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
public class QueueUsingLL
{
    Node front;
    Node rear;
    int size;
    public QueueUsingLL()
    {
        front=null;
        rear=null;
        size=0;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void enqueue(int ele)
    {
        Node n=new Node(ele);
        size++;
        if(rear==null)  //for 1st Node 
        {
            front=n;
            rear=n;
        }
        else
        {
            rear.next=n;
            rear=n;
        }
    }
    public int front()
    {
        if(front==null)
        {
            return -1;
        }
        return front.data;
    }
    public int size()
    {
        return size;
    }
    public int dequeue()
    {
        if(front==null)
        {
            return -1;
        }
        int temp=front.data;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
        size--;
        return temp;
    }
    public static void main(String args[])
    {
        QueueUsingLL q=new QueueUsingLL();
        int arr[]={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++)
        {
            q.enqueue(arr[i]);
        }
        while(!q.isEmpty())
        {
            System.out.print(q.dequeue()+" ");
        }
    }
}