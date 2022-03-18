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
    static binarytree remove(binarytree root)
    {
        if(root==null)
        {
            return null;
        }
        if(root.left==null && root.right==null)
        {
            return null;
        }
        root.left=remove(root.left);
        root.right=remove(root.right);
        return root;
    }
    static void print(binarytree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    public static void main(String args[])
    {
        binarytree b=scan();
        b=remove(b);
        print(b);
    }
}