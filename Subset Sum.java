public class Solution
{
    static boolean isSubsetPresent(int[] arr, int n, int sum)
    {
        if(sum == 0)
        {
            return true;
        }
        if(n == 0)
        {
            return false;
        }
        if(arr[n - 1] > sum)
        {
            return isSubsetPresent(arr, n - 1, sum);
        }
        return isSubsetPresent(arr, n - 1, sum) || isSubsetPresent(arr, n - 1, sum - arr[n - 1]);
    }
}