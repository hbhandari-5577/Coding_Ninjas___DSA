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
        if(size()==0)
        {
            front=0;
        }
        if(size()==data.length)
        {
            doubleCapacity();
        }
        rear=(rear+1)%data.length;  //back to rear -> 0
        data[rear]=ele;
        size++;
    }
    public void doubleCapacity()
    {
        int temp[]=data;
        data=new int[2*temp.length];
        int index=0;
        for(int i=front;i<temp.length;i++) //to copy all elements in FIFO sequence
        {
            data[index++]=temp[i];
        }
        for(int i=0;i<front-1;i++) //to copy remaining elements in array
        {
            data[index++]=temp[i];
        }
        front=0;  //back to 1st position
        rear=temp.length-1;  //back to last position
    }
    public int dequeue()
    {
        if(size()==0)
        {
            return -1;
        }
        int temp=data[front];
        front=(front+1)%data.length;  //back to front -> 0
        size--;
        if(size()==0)
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