public class Solution
{
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==x)
        {
            return true;
        }
        boolean leftChild=isNodePresent(root.left,x);
        if(leftChild)
        {
            return true;
        }
        return isNodePresent(root.right,x);
    }
}