import java.util.*;
public class MyClass
{
    public static void countFreq(String[] str)
    {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            if(!map.containsKey(str[i]))
            {
                map.put(str[i],1);
            }
            else if(map.containsKey(str[i]))
            {
                map.put(str[i],map.get(str[i])+1);
            }
        }
        HashMap<String,Boolean> m=new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            if(!m.containsKey(str[i]))
            {
                m.put(str[i],true);
                System.out.println(str[i]+" "+map.get(str[i]));
            }
        }
    }
    public static void main(String args[])
    {
        String input[]={"Hi","Hello","hi","hello","Hi"};
        countFreq(input);
    }
}