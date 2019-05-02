package model;

public class Node {
    private String name;
    private int childrenCount;
    private Node children[];
    public NodeState state;

    public Node(String name, int initialCapacity) {
        this.name = name;
        this.childrenCount = 0;
        this.children = new Node[initialCapacity];
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public String getName() {
        return name;
    }

    public Node[] getChildren() {
        return children;
    }

    public void addChild(Node x) throws IndexOutOfBoundsException {
        if (children.length <= childrenCount) {
            throw new IndexOutOfBoundsException("No more node can be added");
        }
        children[childrenCount] = x;
        childrenCount++;
    }
}
