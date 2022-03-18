public class Solution
{
    public static boolean checkRedundantBrackets(String input)
    {
	java.util.Stack<Character> st = new java.util.Stack<>(); 
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if (ch == ')')
            { 
                char top = st.peek(); 
                st.pop();
                boolean flag = true; 
                while (top != '(')
                {
                    if (top == '+' || top == '-' || top == '*' || top == '/')
                    { 
                        flag = false; 
                    } 
                    top = st.peek(); 
                    st.pop(); 
                } 
                if (flag == true)
                { 
                    return true; 
                } 
            }
            else
            { 
                st.push(ch); 
            }
        }
        return false;
    }
}