import java.util.ArrayList;
public class Solution
{
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return null;
        }
        if(root.left == null && root.right == null)
        {
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(root.data);
            return ans;
        }
        ArrayList<Integer> leftAns = longestRootToLeafPath(root.left);
        ArrayList<Integer> rightAns = longestRootToLeafPath(root.right);
        if(leftAns == null)
        {
            rightAns.add(root.data);
            return rightAns;
        }
        if(rightAns == null)
        {
            leftAns.add(root.data);
            return leftAns;
        }
        if(leftAns.size() > rightAns.size())
        {
            leftAns.add(root.data);
            return leftAns;
        }
        else
        {
            rightAns.add(root.data);
            return rightAns;
        }
    }
}