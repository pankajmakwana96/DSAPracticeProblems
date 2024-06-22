package tree;

public class Node {
    public int value;
    public Node left;
    public Node right;

    Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    Node(int value) {
        this.value = value;
    }
}
