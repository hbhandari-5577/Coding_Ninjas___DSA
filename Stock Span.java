public class Solution
{
    public static int[] stockSpan(int[] price)
    {
  	int[] S=new int[price.length];
        java.util.Stack<Integer> st = new java.util.Stack<>(); 
        st.push(0); 
        S[0] = 1; 
        for (int i = 1; i < price.length; i++)
        {
            while (!st.empty() && price[i] > price[st.peek()]) 
            {
                st.pop();
            }
            if(st.size()==0)
            {
                S[i]=i+1;
            }
            else
            {
                S[i]=i-st.peek();
            }
            st.push(i);
        }
    	return S;
    }
}