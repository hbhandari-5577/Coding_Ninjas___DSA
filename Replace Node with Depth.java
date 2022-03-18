public class Solution
{
    public static void changeToDepthTree(BinaryTreeNode<Integer> root)
    {
        changeToDepthBT(root,0);
    }
    public static void changeToDepthBT(BinaryTreeNode<Integer> root,int k)
    {
        if(root==null)
        {
            return;
        }
        root.data=k;
        changeToDepthBT(root.left,k+1);
        changeToDepthBT(root.right,k+1);
    }
}