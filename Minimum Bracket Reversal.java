public class Solution
{
    public static int countBracketReversals(String input)
    {
        int len = input.length();
        if (len%2 != 0)
        {
        	return -1;
        }
        java.util.Stack<Character> s=new java.util.Stack<>(); 
        for (int i=0; i<len; i++) 
        { 
            char c = input.charAt(i); 
            if (c =='}' && !s.empty()) 
            { 
                if (s.peek()=='{')
                {
                    s.pop();
                }
                else
                {
                    s.push(c);
                }
            } 
            else
            {
                s.push(c);
            }
        }
        int red_len = s.size();
        int n = 0; 
        while (!s.empty() && s.peek() == '{') 
        { 
            s.pop(); 
            n++; 
        }
        return (red_len/2 + n%2);
    }
}