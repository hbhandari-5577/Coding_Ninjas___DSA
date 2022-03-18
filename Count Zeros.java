public class solution
{
	public static int countZerosRec(int num)
    	{
        	if(num==0)
        	{
        	    return 1;
        	}
        	if(num%10==0)
        	{
        	    return 1+countZerosRec(num/10);
        	}
        	else if (num/10==0)
        	{
        	    return 0;
        	}
        	else
        	{
        		return countZerosRec(num/10);
        	}
	}
}