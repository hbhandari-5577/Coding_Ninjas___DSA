import java.util.*;
public class Solution
{
    public static BinaryTreeNode<Integer> buildTree(int[] postorder,int[] inorder)
    {
        if(inorder.length == 0 || postorder.length == 0)
        {
            return null;
        }
        int ip = inorder.length - 1;
        int pp = postorder.length - 1;
        Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
        BinaryTreeNode<Integer> prev = null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(postorder[pp]);
        stack.push(root);
        pp--;
        while (pp >= 0)
        {
            while(!stack.isEmpty() && stack.peek().data == inorder[ip])
            {
                prev = stack.pop();
                ip--;
            }
            BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(postorder[pp]);
            if(prev != null)
            {
                prev.left = newNode;
            }
            else if(!stack.isEmpty())
            {
                BinaryTreeNode<Integer> currTop = stack.peek();
                currTop.right = newNode;
            }
            stack.push(newNode);
            prev = null;
            pp--;
        }
        return root;
    }
}