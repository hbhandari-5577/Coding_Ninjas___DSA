public class Solution
{
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root)
    {
        if (root == null)
        {
            return;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft = root.left;
        root.left = newNode;
        newNode.left = rootLeft;
        insertDuplicateNode(rootLeft);
        insertDuplicateNode(root.right);
    }
}