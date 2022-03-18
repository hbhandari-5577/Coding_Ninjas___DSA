class binarytree
{
    int data;
    binarytree left;
    binarytree right;
    public binarytree(int data)
    {
        this.data=data;
    }
}
public class BT
{
    public static void print(binarytree root)
    {
        if(root==null) // base case
        {
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null) // if root's left side has value
        {
            System.out.print("L"+root.left.data+",");
        }
        if(root.right!=null) // if root's right side has value
        {
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }
    public static void main(String args[])
    {
        binarytree b1=new binarytree(1);
        binarytree b2=new binarytree(2);
        binarytree b3=new binarytree(3);
        binarytree b4=new binarytree(4);
        binarytree b5=new binarytree(5);
        b1.left=b2;
        b1.right=b3;
        b2.right=b4;
        b3.left=b5;
        print(b1);
    }
}