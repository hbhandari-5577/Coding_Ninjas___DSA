public class solution
{
	public static double findGeometricSum(int k)
	{
        	double sum=1/Math.pow(2,k);
        	if(k==0)
        	{
        		return 1;
        	}
        	k--;
        	sum=sum+ findGeometricSum(k);
        	return sum;
	}
}