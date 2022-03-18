import java.util.Queue;
import java.util.LinkedList;
public class Stack
{
    int size;
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();
    static int curr_size;
    public Stack()
    {
        curr_size = 0;
    }
    static void push(int x)
    {
        curr_size++;
        q2.add(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }  
    static int pop()
    {
        if(q1.isEmpty())
        {
            return -1;
        }
        int temp=q1.remove();
        curr_size--;
        return temp;
    }
    static int top()
    {
        if (q1.isEmpty())
        {
            return -1;
        }
        return q1.peek();
    }
    static boolean isEmpty()
    {
        return curr_size==0;
    }
    static int getSize()
    {
        return curr_size;
    } 
}