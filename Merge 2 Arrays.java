class Solution
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        int arr[]=new int[nums1.length+nums2.length];
        int count=0;
        for(int i=0;i<nums1.length;i++)
        {
            arr[count]=nums1[i];
            count++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr[count]=nums2[i];
            count++;
        }
        return arr;
    }
}