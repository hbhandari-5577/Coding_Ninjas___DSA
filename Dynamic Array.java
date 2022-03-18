public class MyClass
{
    public static void main(String args[])
    {
        dynamicArray d=new dynamicArray();
        for(int i=1;i<10;i++)
        {
            d.add(i);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(d.arr[i]);
        }
        System.out.println();
        System.out.println(d.size());
        System.out.println();
        System.out.println(d.get(2));
        System.out.println();
        d.set(3,170);
        System.out.println(d.get(3));
        System.out.println();
        while(!d.isEmpty())
        {
            System.out.println(d.removeLast());
            System.out.println("Size -> "+d.size());
        }
    }
}
class dynamicArray
{
    int arr[],nextElementIndex;
    
    public dynamicArray()
    {
        arr=new int[5];
        int nextElementIndex=0;
    }
    
    public int size()
    {
        return nextElementIndex;
    }
    
    public boolean isEmpty()
    {
        return nextElementIndex==0;
    }
    
    public int get(int i)
    {
        if(i>=nextElementIndex)
        {
            return -1;
        }
        return arr[i];
    }
    
    public void set(int i,int value)
    {
        if(i>=nextElementIndex)
        {
            return;
        }
        arr[i]=value;
    }
    
    public void add(int value)
    {
        if(nextElementIndex==arr.length)
        {
            doubleCapacity();
        }
        arr[nextElementIndex]=value;
        nextElementIndex++;
    }
    
    public void doubleCapacity()
    {
        int temp[]=arr;
        arr=new int[2*temp.length];
        for(int i=0;i<temp.length;i++)
        {
            arr[i]=temp[i];
        }
    }
    
    public int removeLast()
    {
        if(nextElementIndex==0)
        {
            return -1;
        }
        int temp=arr[nextElementIndex-1];
        arr[nextElementIndex-1]=0;
        nextElementIndex--;
        return temp;
    }
}