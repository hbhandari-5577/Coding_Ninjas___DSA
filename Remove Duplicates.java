import java.util.*;
public class MyClass
{
    public static ArrayList<Integer> removeDuplicates(int[] arr)
    {
        ArrayList<Integer> output=new ArrayList<>();
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                output.add(arr[i]);
                map.put(arr[i],true);
            }
        }
        return output;
    }
    public static void main(String args[])
    {
        int arr[]={1,3,2,2,3,1,2,6,5};
        ArrayList<Integer> output=removeDuplicates(arr);
        for(int i=0;i<output.size();i++)
        {
            System.out.print(output.get(i)+" ");
        }
    }
}