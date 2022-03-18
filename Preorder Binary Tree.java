public class Solution
{
    public static void preOrder(binarytree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}