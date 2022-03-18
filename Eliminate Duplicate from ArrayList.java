import java.util.*;
import java.util.ArrayList;
public class MyClass
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(10);
        ArrayList<Integer> a=new ArrayList<>();
        a.add(arr.get(0));
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)!=arr.get(i-1))
            {
                a.add(arr.get(i));
            }
        }
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
    }
}