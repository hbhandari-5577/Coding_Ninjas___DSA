public class Solution
{
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int count=Math.max(left,right);
        return 1+count; // here +1 means every node is adding 1 corresponding to itself becoming exactly equal to count
    }
}