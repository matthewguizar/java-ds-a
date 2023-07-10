package basic.tree;

public class BinarySearchTree {
    /*
        a tree data structure where each node is greater than its left child be less than its right

        benefit is that locating a node is rather simple when they are in this order

        time: best case O(log n)
              worst case: O(n)
        space: O(n)
     */

    Nodes root;

    public void insert(Nodes node)
    {
        root = insertHelper(root, node);
    }
    private Nodes insertHelper(Nodes root, Nodes node)
    {   int data = node.data;

        if (root == null)
        {
            root = node;
            return root;
        }
        else if (data < root.data)
        {
            root.left = insertHelper(root.left, node);

        }
        else
        {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display()
    {
        displayHelper(root);
    }
    private void displayHelper(Nodes root)
    {
        if (root != null)
        {
            displayHelper(root.left); //replace left with right and vice versa to implement reverse
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    public boolean search(int data)
    {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Nodes root, int data)
    {
        if (root == null)
        {
            return false;
        }
        else if (root.data == data)
        {
            return true;
        }
        else if (root.data > data)
        {
            return searchHelper(root.left, data);
        }
        else
        {
            return searchHelper(root.right, data);
        }
    }
    public void remove(int data)
    {

        if (search(data))
        {
            removeHelper(root, data);
        }
        else
        {
            System.out.println(data + " could not be found");
        }

    }
    public Nodes removeHelper(Nodes root, int data)
    {
        if (root == null)
        {
            return root;
        }
        else if (data < root.data)
        {
            root.left = removeHelper(root.left, data);
        }
        else if (data > root.data)
        {
            root.right = removeHelper(root.right, data);
        }
        else //node found
        {
            if (root.left == null && root.right == null)
            {
                root = null;
            }
            else if (root.right != null)
            {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else
            { //find predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Nodes root) //find the least value below the right child of this root node
    {
        root = root.right;
        while (root.left != null)
        {
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Nodes root)
    {
        root = root.left;
        while (root.right != null)
        {
            root = root.right;
        }
        return root.data;
    }




}
