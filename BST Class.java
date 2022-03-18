public class BinarySearchTree
{
    private BinaryTreeNode<Integer> root;
    public void insert(int data)
    {
        root = insert(data, root);
    }
    private BinaryTreeNode<Integer> insert(int data, BinaryTreeNode<Integer> root)
    {
        if (root == null)
        {
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            return newNode;
        }
        if(root.data >= data)
        {
            root.left = insert(data, root.left);
        }
        else
        {
            root.right = insert(data, root.right);
        }
        return root;
    }
    public void remove(int data)
    {
        root = remove(data, root);
    }
    private BinaryTreeNode<Integer> remove(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return null;
        }
        if(data < root.data)
        {
            root.left = remove(data, root.left);
            return root;
        }
        else if(data > root.data)
        {
            root.right = remove(data, root.right);
            return root;
        }
        else
        {
            if(root.left == null && root.right == null) // only 0 child
            {
                return null;
            }
            else if(root.left == null) // only right child
            {
                return root.right;
            }
            else if(root.right == null) // only left child
            {
                return root.left;
            }
            else // for 2 childs
            {
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left != null)
                {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = remove(minNode.data, root.right);
                return root;
            }
        }
    }
    public void printTree()
    {
        printTree(root);
    }
    private void printTree(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + ":");
        if(root.left != null)
        {
            System.out.print("L:" + root.left.data + ",");
        }
        if(root.right != null)
        {
            System.out.print("R:" + root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    public boolean search(int data)
    {
        return search(data, root);
    }
    private boolean search(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null)
        { 
        return false;
        }
        if(root.data == data)
        {
            return true;
        }
        else if(data > root.data)
        {
            return search(data, root.right);
        }
        else
        {
            return search(data, root.left);
        }
    }
}