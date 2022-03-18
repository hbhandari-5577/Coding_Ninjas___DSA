public class Solution
{
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        BinaryTreeNode<Integer> b;
        b=root.right;
        root.right=root.left;
        root.left=b;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }
}