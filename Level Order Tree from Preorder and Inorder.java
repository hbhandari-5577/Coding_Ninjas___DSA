import java.util.*;
class binarytree
{
    int data;
    binarytree left;
    binarytree right;
    binarytree(int data)
    {
        this.data=data;
    }
}
public class Main
{
    public static binarytree treeBuild(int[] preOrder,int[] inOrder)
    {
        return helper(0,0,inOrder.length-1,preOrder,inOrder);
    }
    public static binarytree helper(int preStart,int inStart,int inEnd,int[] preOrder,int[] inOrder)
    {
        if(preStart>preOrder.length-1 || inStart>inEnd)
        {
            return null;
        }
        binarytree root=new binarytree(preOrder[preStart]);
        int inIndex=0;
        for(int i=inStart;i<=inEnd;i++)
        {
            if(inOrder[i]==root.data)
            {
                inIndex=i;
            }
        }
        root.left=helper(preStart+1,inStart,inIndex-1,preOrder,inOrder);
        root.right=helper(preStart+inIndex-inStart+1,inIndex+1,inEnd,preOrder,inOrder);
        return root;
    }
    public static void print(binarytree root)
    {
        Queue<binarytree> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                root=q.remove();
                System.out.print(root.data+" ");
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
    public static void main(String args[])
    {
        int preOrder[]={2,7,3,6,8,11,5,9,4};
        int inOrder[]={3,7,8,6,11,2,5,4,9};
        binarytree root=treeBuild(preOrder,inOrder);
        print(root);
    }
}