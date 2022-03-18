public class QueueUsingArrays
{
    int data[];
    int front,rear,size;
    public QueueUsingArrays()
    {
        data=new int[2];
        front=-1;
        rear=-1;
        size=0;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public int front()
    {
        if(size()==0)
        {
            return -1;
        }
        return data[front];
    }
    public void enqueue(int ele)
    {
        if(size()==0)  //for 1st value
        {
            front=0;
        }
        if(size()==data.length)
        {
            doubleCapacity();
        }        
        rear++;
        data[rear]=ele;
        size++;
    }
    public void doubleCapacity()
    {
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++)
        {
            data[i]=temp[i];
        }
    }
    public int dequeue()
    {
        if(size()==0)  //Empty Queue
        {
            return -1;
        }
        int temp=data[front];
        front++;
        size--;
        if(size()==0)  //when front>rear
        {
            front=-1;
            rear=-1;
        }
        return temp;
    }
    public static void main(String args[])
    {
        QueueUsingArrays q=new QueueUsingArrays();
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
            q.enqueue(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(q.dequeue()+" ");
        }
    }
}