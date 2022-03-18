public class Solution
{
	public static int Index1(int input[],int x,int index)
        {
        	if(input[index]==x)
        	{
        		return index;
        	}
        	if(input[index]!=x && index==input.length-1)
        	{
            		return -1;
        	}
        	index=Index1(input,x,index+1);
        	return index;   
    	}
	public static int firstIndex(int input[], int x)
    	{	  
        	int index=Index1(input,x,0);
        	return index;
	}
}