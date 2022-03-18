public class BS 
{
    public static int binarySearch(int a[], int li, int hi, int x)
    {
        int midIndex=(li+hi)/2;
        if(li<=hi)
        {
            if(a[midIndex]==x)
            {
                return midIndex;
            }
            else if(a[midIndex]<x)
            {
                return binarySearch(a, midIndex+1, hi, x);
            }
            else if(a[midIndex]>x)
            {
                return binarySearch(a, li, midIndex-1, x);
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.print(binarySearch(a, 0, a.length-1, 2));
    }
}