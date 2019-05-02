package model;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NodeTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    Node node = new Node("Node 1", 2);

    @Test
    public void test_addChildren() throws Exception {
        Assert.assertEquals(0, node.getChildrenCount());

        node.addChild(new Node("Node 1a", 5));
        Assert.assertEquals(1, node.getChildrenCount());
        Assert.assertEquals("Node 1a", node.getChildren()[0].getName());

        node.addChild(new Node("Node 1b", 5));
        Assert.assertEquals(2, node.getChildrenCount());
        Assert.assertEquals("Node 1a", node.getChildren()[0].getName());
        Assert.assertEquals("Node 1b", node.getChildren()[1].getName());

        exception.expect(IndexOutOfBoundsException.class);
        node.addChild(new Node("Node 1c", 5));
    }
}
