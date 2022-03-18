import java.util.*;
public class Solution
{
    public static void printLevelWise(BinaryTreeNode<Integer> root)
    {
        Queue<BinaryTreeNode<Integer>> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                root=q.remove();
                System.out.print(root.data+":");
                if(root.left!=null)
                {
                    System.out.print("L:"+root.left.data+",");
                }
                else if(root.left==null)
                {
                    System.out.print("L:"+"-1"+",");
                }
                if(root.right!=null)
                {
                    System.out.print("R:"+root.right.data);
                }
                else if(root.right==null)
                {
                    System.out.print("R:"+"-1");
                }                
        		System.out.println();
                if(root.left!=null)
                {
                    q.add(root.left);
                }
                if(root.right!=null)
                {
                    q.add(root.right);
                }
            }
        }
    }
}