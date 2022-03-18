public class Solution
{
    public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root,int sum)
    {
        if(root==null)
        {
            return sum;
        }

        // Reverse InOrder Traversal

        sum=replaceWithLargerNodesSum(root.right,sum);
        sum+=root.data;
        root.data=sum;
        sum=replaceWithLargerNodesSum(root.left,sum);
        return sum;
    }
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root)
    {
        replaceWithLargerNodesSum(root,0);
    }
}