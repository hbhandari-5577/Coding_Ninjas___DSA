public class Solution
{
	public static int arrayEquilibriumIndex(int[] arr)
    	{  
		int totalSum=0,leftSum=0,i;
        	for(i=0;i<arr.length;i++)
        	{
        	    totalSum+=arr[i];
        	}
        	for(i=0;i<arr.length;i++)
        	{
        	    totalSum-=arr[i];
        	    if(totalSum==leftSum)
        	    {
        	        return i;
        	    }
        	    leftSum+=arr[i];
        	}
	        return -1;
	}
}