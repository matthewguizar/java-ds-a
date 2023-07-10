package basic.search;

import basic.graphs.Node;

public class BreadthFirstSearch {
    /*
        BFS = A search algorithm for traversing a tree or graph data structure.
        this is done one level at a time, rather than one branch at a time.
        using a queue

        Traverse a graph level by level and utilizes a queue
        better if destination is on average close to start
        siblings are visited before children
     */
    public static void main(String[] args) {
        GraphBF graph = new GraphBF(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();


        graph.breadthFirstSearch(4);
    }
}
