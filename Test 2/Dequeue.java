public class Dequeue
{
    int arr[];
    int front;
    int rear;
    int size;
    Dequeue(int size)
    {
        front = -1;
        rear = 0;
        this.size = size;
        arr = new int[size];
    }
    Dequeue()
    {
        front = -1;
        rear = 0;
        this.size = 10;
        arr = new int[size];
    }
    boolean isFull()
    {
        return (front == (rear+1)%size);
    }
    boolean isEmpty ()
    {
        return (front == -1);
    }
    void insertFront(int input)
    {
        if(isFull())
        {
            System.out.println(-1);
            return;
        }
        if(front == -1)
        {
            front = 0;
            rear = 0;
        }
        else
        {
            front = ((front-1)%size+size)%size;
        }
        arr[front] = input;
    }
    void insertRear(int input)
    {
        if(isFull())
        {
            System.out.println(-1);
            return;
        }
        if(front == -1)
        {
            front = 0;
            rear = 0;
        }
        else
        {
            rear = (rear+1)%size;
        }
        arr[rear] = input;
    }
    void deleteFront()
    {
        if(isEmpty())
        {
            System.out.println(-1);
            return;
        }
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front = (front+1)%size;
        }
    }
    void deleteRear()
    {
        if(isEmpty())
        {
            System.out.println(-1);
            return;
        }
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            rear = ((rear-1)%size+size)%size;
        }
    }
    int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }
        return arr[front];
    }
    int getRear()
    {
        if(isEmpty() || rear < 0)
        {
            return -1;
        }
        return arr[rear];
    }
}