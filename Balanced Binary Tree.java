import java.util.*;
class binarytree
{
    int data;
    binarytree left,right;
    binarytree(int data)
    {
        this.data=data;
    }
}
public class BT
{
    public static Scanner sc=new Scanner(System.in);
    static binarytree scan()
    {
        int data=sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        binarytree root=new binarytree(data);
        binarytree leftChild=scan();
        binarytree rightChild=scan();
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static int height(binarytree root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftSide=height(root.left);
        int rightSide=height(root.right);
        int count=Math.max(leftSide,rightSide);
        return 1+count;
    }
    public static boolean isBalanced(binarytree root)
    {
        if(root==null)
        {
            return true;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(Math.abs(leftHeight-rightHeight)>1)
        {
            return false;
        }
        boolean isLeftBalanced=isBalanced(root.left);
        boolean isrightBalanced=isBalanced(root.right);
        return isLeftBalanced && isrightBalanced;
    }
    public static void main(String args[])
    {
        binarytree b=scan();
        boolean bal=isBalanced(b);
        if(bal)
        {
            System.out.print("Balanced");
        }
        else
        {
            System.out.print("Not Balanced");
        }
    }
}