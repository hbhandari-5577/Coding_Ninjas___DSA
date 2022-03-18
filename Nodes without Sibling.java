public class Solution
{
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> node)
    {
        if(node==null)
        {
            return;
        }
        if(node.left!=null && node.right!=null)
        {
            printNodesWithoutSibling(node.left);
            printNodesWithoutSibling(node.right);
        }
        else if(node.right!=null)
        {
            System.out.print(node.right.data+" ");
            printNodesWithoutSibling(node.right);
        }
        else if(node.left!=null)
        {
            System.out.print(node.left.data+" ");
            printNodesWithoutSibling(node.left);
        }
    }
}