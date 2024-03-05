import java.util.Stack;

class Iterator {
    private BinaryTree tree;
    private Stack<Node> stack;

    public Iterator(BinaryTree tree) {
        this.tree = tree;
        this.stack = new Stack<>();
    }

    private void pushAll(Node node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public Node first() {
        Node current = tree.root;
        while (current.left != null) {
            stack.push(current);
            current = current.left;
        }
        return current;
    }

    public Node next() {
        if (!hasNext()) {
            throw new RuntimeException("No more elements to iterate");
        }
        Node current = stack.pop();
        pushAll(current.right);
        return current;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}