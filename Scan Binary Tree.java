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
    static void print(binarytree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null)
        {
            System.out.print("L"+root.left.data+" ");
        }
        if(root.right!=null)
        {
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }
    public static void main(String args[])
    {
        binarytree b=scan();
        print(b);
    }
}