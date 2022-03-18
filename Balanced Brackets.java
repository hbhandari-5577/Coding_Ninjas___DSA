public class Solution
{
    public static boolean isBalanced(String expression)
    {
	java.util.Stack<Character> s=new java.util.Stack<>();
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
            if(c=='{' || c=='[' ||c=='(')
            {
                s.push(c);
            }
            else
            {
                if(s.isEmpty())
                {
                    return false;
                }
                else
                {
                    char popValue=s.pop();
                    if(c==')' && popValue!='(')
                    {
                        return false;
                    }
                    else if(c==']' && popValue!='[')
                    {
                        return false;
                    }
                    else if(c=='}' && popValue!='{')
                    {
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}