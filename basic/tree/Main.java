package basic.tree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Nodes(5));
        tree.insert(new Nodes(1));
        tree.insert(new Nodes(9));
        tree.insert(new Nodes(2));
        tree.insert(new Nodes(7));
        tree.insert(new Nodes(3));
        tree.insert(new Nodes(6));
        tree.insert(new Nodes(4));
        tree.insert(new Nodes(8));

        tree.remove(0);

        tree.display();

        System.out.println(tree.search(1));
    }
}
