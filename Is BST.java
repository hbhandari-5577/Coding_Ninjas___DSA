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
    public static binarytree scan()
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
    public static int maximum(binarytree root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int leftSide=maximum(root.left);
        int rightSide=maximum(root.right);
        return Math.max(root.data,Math.max(leftSide,rightSide));
    }
    public static int minimum(binarytree root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int leftSide=minimum(root.left);
        int rightSide=minimum(root.right);
        return Math.min(root.data,Math.min(leftSide,rightSide));
    }    
    public static boolean isBST(binarytree root)
    {
        if(root==null)
        {
            return true;
        }
        int leftMax=maximum(root.left); // calculate Maximim value from left-side of BT
        if(leftMax>=root.data) // whether Maximum value is greater than root's data
        {
            return false;
        }
        int rightMin=minimum(root.right); // calculate Minimum value from left-side of BT
        if(rightMin<root.data) // whether Minimum value is less than root's data
        {
            return false;
        }
        boolean leftSide=isBST(root.left); // is every Node in BT true or False
        boolean rightSide=isBST(root.right); // is every Node in BT true or False
        return leftSide && rightSide;
    }
    public static void main(String args[])
    {
        binarytree root=scan();
        boolean bst=isBST(root);
        if(bst)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}