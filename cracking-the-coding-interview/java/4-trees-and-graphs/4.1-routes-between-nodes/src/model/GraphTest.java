package model;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GraphTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    Graph graph = new Graph(2);

    @Test
    public void test_addNode() {
        Assert.assertEquals(0, graph.getNodesCount());

        graph.addNode(new Node("Node 1a", 5));
        Assert.assertEquals(1, graph.getNodesCount());
        Assert.assertEquals("Node 1a", graph.getNodes()[0].getName());

        graph.addNode(new Node("Node 1b", 5));
        Assert.assertEquals(2, graph.getNodesCount());
        Assert.assertEquals("Node 1a", graph.getNodes()[0].getName());
        Assert.assertEquals("Node 1b", graph.getNodes()[1].getName());

        exception.expect(IndexOutOfBoundsException.class);
        graph.addNode(new Node("Node 1c", 5));
    }
}
