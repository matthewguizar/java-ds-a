package basic.graphs;

public class AdjacencyList {
    public static void main(String[] args) {

        /*
            an array/arraylist of linked lists
            each linked list has a unique node at the head.
            all adjacent neighbors to that node are added to that node's linked list

            runtime: to check for an edge: O(n) number of vertices
            space: O(n + e)
         */

        ListGraph graph = new ListGraph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

    }
}
