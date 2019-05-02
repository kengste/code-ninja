package model;

import java.util.LinkedList;

public class Solution {

    public boolean routesBetweenNodes(Graph graph, Node start, Node end) {
        LinkedList<Node> linkedList = new LinkedList<>();
        for (Node node: graph.getNodes()) {
            node.state = NodeState.Unvisited;
        }
        start.state = NodeState.Visiting;
        linkedList.add(start);
        Node node;
        while (!linkedList.isEmpty()) {
            node = linkedList.removeFirst();
            if (node != null) {
                for (Node child: node.getChildren()) {
                    if (child.state == NodeState.Unvisited && child == end) {
                        return true;
                    }
                    child.state = NodeState.Visiting;
                    linkedList.add(child);
                }
                node.state = NodeState.Visited;
            }
        }
        return false;
    }
}
