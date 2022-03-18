public class MergeSort
{
    int a[];
    int mergeArray[];
    int length;
    public static void main(String args[])
    {
        int arr[]={48,36,13,52,19,94,21};
        MergeSort ms=new MergeSort();
        ms.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void sort(int arr[])
    {
        this.a=arr;
        this.length=arr.length;
        this.mergeArray=new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int li, int hi)
    {
        if(li<hi)
        {
            int mi=li+(hi-li)/2;
            divideArray(li, mi);  //It will sort left side of an array
            divideArray(mi+1, hi);  //It will sort right side of an array
            mergeArray(li, mi, hi);
        }
    }
    public void mergeArray(int li, int mi, int hi)
    {
        for(int i=li;i<=hi;i++)
        {
            mergeArray[i]=a[i];
        }
        int i=li;
        int j=mi+1;
        int k=li;
        while(i<=mi && j<=hi)
        {
            if(mergeArray[i]<=mergeArray[j])
            {
                a[k]=mergeArray[i];
                i++;  //won't consider the same element next time in loop
            }
            else
            {
                a[k]=mergeArray[j];
                j++;  //won't consider the same element next time in loop
            }
            k++;
        }
        while(i<=mi) //Copy remaining elements if any
        {
            a[k]=mergeArray[i];
            k++;
            i++;
        }
    }
}