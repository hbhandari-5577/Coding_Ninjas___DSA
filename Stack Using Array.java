public class StackUsingArray
{
    int data[];
    int topIndex;
    public StackUsingArray()
    {
        data=new int[5];
        topIndex=-1;
    }
    public void push(int ele)
    {
        if(size()==data.length)
        {
            doubleCapacity();
        }
        data[++topIndex]=ele;
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
    public int pop()
    {
        if(size()==0)
        {
            return -1;
        }
        int temp=data[topIndex];
        topIndex--;
        return temp;
    }
    public boolean isEmpty()
    {
        return topIndex==-1;
    }
    public int size()
    {
        return topIndex+1;
    }
    public int peek()
    {
        if(size()==0)
        {
            return -1;
        }
        return data[topIndex];
    }
    public static void main(String args[])
    {
        StackUsingArray s=new StackUsingArray();
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