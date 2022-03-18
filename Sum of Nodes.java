public class Solution
{
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
    public static int getSum(binarytree root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftSum=getSum(root.left);
        int rightSum=getSum(root.right);
        return root.data+leftSum+rightSum;
    }
    public static void main(String args[])
    {
        binarytree b=scan();
        int sum=getSum(b);
        System.out.print("Sum of Nodes -> "+sum);
    }
}
}