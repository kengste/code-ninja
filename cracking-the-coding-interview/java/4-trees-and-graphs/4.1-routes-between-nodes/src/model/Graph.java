package model;

public class Graph {
    private int nodesCount;
    private Node nodes[];

    public Graph(int MAX_NODES) {
        nodes = new Node[MAX_NODES];
        nodesCount = 0;
    }

    public void addNode(Node x) throws IndexOutOfBoundsException {
        if (nodes.length <= nodesCount) {
            throw new IndexOutOfBoundsException("Graph has reached max capacity");
        }
        nodes[nodesCount] = x;
        nodesCount++;
    }

    public int getNodesCount() {
        return nodesCount;
    }

    public Node[] getNodes() {
        return nodes;
    }
}
