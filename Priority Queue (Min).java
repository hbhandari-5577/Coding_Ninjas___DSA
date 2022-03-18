import java.util.*;
class Priority_Queue_Exception extends Exception{}
class element
{
    int value;
    int priority;
    public element(int value,int priority)
    {
        this.value=value;
        this.priority=priority;
    }
}
class priorityqueue
{
    public ArrayList<element> heap;
    public priorityqueue()
    {
        heap=new ArrayList<>();
    }
    public void insert(int value,int priority)
    {
        element e=new element(value,priority);
        heap.add(e);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
        while(childIndex>0) // loop will execte until childIndex is greater than 0
        {
            if(heap.get(childIndex).priority<heap.get(parentIndex).priority) // swapping will take place only if priority of child is less than priority of parent as it is min-heap
            {
                element temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex; // changing index of child and parent
                parentIndex=(childIndex-1)/2;
            }
            else
            {
                return;
            }
        }
    }
    public int getMin() throws Priority_Queue_Exception
    {
        if(isEmpty())
        {
            throw new Priority_Queue_Exception();
        }
        return heap.get(0).value;
    }
    public int removeMin() throws Priority_Queue_Exception
    {
        if(isEmpty())
        {
            throw new Priority_Queue_Exception();
        }
        element remove=heap.get(0); // store root's element in remove
        int ans=remove.value; // get root's value
        heap.set(0,heap.get(heap.size()-1)); // set Last element of ArrayList at 0th index
        heap.remove(heap.size()-1); // remove last element from ArrayList
        int parentIndex=0;
        int leftChildIndex=2*parentIndex+1;
        int rightChildIndex=2*parentIndex+2;
        while(leftChildIndex<heap.size()) // if left child exists
        {
            int minIndex=parentIndex; // finding minimum index among parent and its children
            if(heap.get(leftChildIndex).priority<heap.get(minIndex).priority) // if parent is less than left child
            {
                minIndex=leftChildIndex;
            }
            if(rightChildIndex<heap.size() && heap.get(rightChildIndex).priority<heap.get(minIndex).priority) // if right child is less than heap's size and parent is less than right child
            {
                minIndex=rightChildIndex;
            }
            if(minIndex==parentIndex) // if correct position is found
            {
                break;
            }
            element temp=heap.get(minIndex); // swap
            heap.set(minIndex,heap.get(parentIndex));
            heap.set(parentIndex,temp);
            parentIndex=minIndex; // changing index of child and parent
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        }
        return ans;
    }
    public int size()
    {
        return heap.size();
    }
    public boolean isEmpty()
    {
        return size()==0;
    }
}
public class MyClass
{
    public static void main(String args[]) throws Priority_Queue_Exception
    {
        priorityqueue pq=new priorityqueue();
        pq.insert(6,3);
        pq.insert(3,6);
        pq.insert(9,1);
        pq.insert(5,4);
        pq.insert(4,5);
        pq.insert(8,2);
        while(!pq.isEmpty())
        {
            System.out.print(pq.getMin()+" ");
            pq.removeMin();
        }
    }
}