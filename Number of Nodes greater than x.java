public class Solution
{
    static int count=0;
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data>x)
        {
            count++;
        }
        countNodesGreaterThanX(root.left,x);
        countNodesGreaterThanX(root.right,x);
        return count;
    }
}