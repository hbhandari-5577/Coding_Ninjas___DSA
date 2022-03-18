import java.util.HashMap;
public class Solution
{
    public static String uniqueChar(String str)
    {
        if(str.length() == 0)
        {
            return "";
        }
        String ans = "";
        HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
        for(int i=0;i<str.length();i++)
        {
            char currChar = str.charAt(i);
            if(!map.containsKey(currChar))
            {
                map.put(currChar, true);
                ans += currChar;
            }
        }
        return ans;
    }
}