public class Solution
{
    public static void reverseStack(java.util.Stack<Integer> s1, java.util.Stack<Integer> s2)
    {
	if(s1.size()==0||s1.size()==1)
    	{
            return;
        }
        int temp=s1.pop();  //Store top element in variable
        reverseStack(s1,s2);  //reverse stack using recursion
        while(!s1.isEmpty())  //push elements in helper from input stack
        {
	    s2.push(s1.pop());
	}	
        s1.push(temp);  //push variable element in input stack
        while(!s2.isEmpty())  //push all elements in input stack from helper stack
        {
	    s1.push(s2.pop());
	}
    }
}