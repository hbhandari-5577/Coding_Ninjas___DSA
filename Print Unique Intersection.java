class Solution
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int size1=nums1.length;
        int size2=nums2.length;
        while(i<size1 && j<size2)
        {
            if(nums1[i]==nums2[j])
            {
                al.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        HashMap<Integer,Boolean> map=new HashMap<>();
        ArrayList<Integer> a=new ArrayList<>();
        int cnt=0;
        for(int k=0;k<al.size();k++)
        {
            if(!map.containsKey(al.get(k)))
            {
                map.put(al.get(k),true);
                a.add(al.get(k));
                cnt++;
            }
        }
        int arr[]=new int[cnt];
        int count=0;
        for(int k=0;k<a.size();k++)
        {
            arr[count]=a.get(k);
            count++;
        }
        return arr;
    }
}