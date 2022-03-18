public class Solution
{
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftSide=height(root.left);
        int rightSide=height(root.right);
        int count=Math.max(leftSide,rightSide);
        return 1+count;
    }    
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myValue=1+leftHeight+rightHeight;
        int leftDiameter=diameterOfBinaryTree(root.left);
        int rightDiameter=diameterOfBinaryTree(root.right);
        int finalDiameter=Math.max(myValue, Math.max(leftDiameter,rightDiameter));
        return finalDiameter;
    }
}