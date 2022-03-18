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
    public static int countNodes(binarytree root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftCount=countNodes(root.left);
        int rightCount=countNodes(root.right);
        return leftCount+rightCount+1; // here +1 means every node is adding 1 corresponding to itself becoming exactly equal to count
    }
    public static void main(String args[])
    {
        binarytree b=scan();
        int count=countNodes(b);
        System.out.print("Number of Nodes -> "+count);
    }
}