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
    static void leftSide(binarytree root)
    {
        Queue<binarytree> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                root=q.remove();
                if(i==0) // at this point we will be at the first value of tree for each level
                {
                    System.out.print(root.data+" ");
                }
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
        binarytree root=scan();
        leftSide(root);
    }
}