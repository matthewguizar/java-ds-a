package basic.search;


import basic.graphs.Node;

public class DepthFirst {

    /*
        a search algorithm for traversing a tree or graph data structure

        1. pick a route
        2. keep going until you reach a dead end, or a previously visited node
        3. backtrack to last node that has unvisited adjacent neighbors

        Traverse a graph branch by branch
        utilizes a stack
        better if destination is on average far from the start
        children are visited before siblings
        more popular for games/puzzles
     */

    public static void main(String[] args) {

        GraphDF graph = new GraphDF(5);

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

        graph.depthFirstSearch(4);
    }
}
