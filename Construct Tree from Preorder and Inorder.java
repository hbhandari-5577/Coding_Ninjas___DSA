import java.util.*;
public class Solution
{
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder)
    {
        return helper(0,0,inOrder.length-1,preOrder,inOrder);
    }
    public static BinaryTreeNode<Integer> helper(int preStart,int inStart,int inEnd,int[] preorder,int[] inorder)
    {
        if(preStart>preorder.length-1 || inStart>inEnd)
        {
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(preorder[preStart]);
        int inIndex = 0;
        for(int i=inStart;i<=inEnd;i++)
        {
            if(inorder[i] == root.data)
            {
                inIndex = i;
            }
        }
        root.left=helper(preStart+1,inStart,inIndex-1,preorder,inorder);
        root.right=helper(preStart+inIndex-inStart+1,inIndex+1,inEnd,preorder,inorder);
        return root;
    }
}