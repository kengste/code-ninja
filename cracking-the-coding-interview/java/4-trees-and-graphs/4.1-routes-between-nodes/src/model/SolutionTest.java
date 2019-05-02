package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution = new Solution();
    Graph graph = new Graph(6);
    Node[] temp = new Node[6];


    @Before
    public void beforeFunction() {
        temp[0] = new Node("a", 3);
        temp[1] = new Node("b", 0);
        temp[2] = new Node("c", 0);
        temp[3] = new Node("d", 1);
        temp[4] = new Node("e", 1);
        temp[5] = new Node("f", 0);

        temp[0].addChild(temp[1]);
        temp[0].addChild(temp[2]);
        temp[0].addChild(temp[3]);
        temp[3].addChild(temp[4]);
        temp[4].addChild(temp[5]);

        for (int i = 0; i < 6; i++) {
            graph.addNode(temp[i]);
        }
    }

    @Test
    public void test_routesBetweenNodes() {
        Node[] nodes = graph.getNodes();
        Node start1 = nodes[3];
        Node end1 = nodes[5];
        Assert.assertTrue(solution.routesBetweenNodes(graph, start1, end1));
        Node start2 = nodes[2];
        Node end2 = nodes[4];
        Assert.assertFalse(solution.routesBetweenNodes(graph, start2, end2));
        Node start3 = nodes[0];
        Node end3 = nodes[5];
        Assert.assertTrue(solution.routesBetweenNodes(graph, start3, end3));
    }
}
