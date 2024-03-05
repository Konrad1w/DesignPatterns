class BinaryTree {
    Node root;

    public BinaryTree(int root) {
        this.root = new Node(root);
    }

    public void insert(int[] values) {
        for (int value : values) {
            _insert(root, value);
        }
    }

    private void _insert(Node currentNode, int value) {
        if (value < currentNode.value) {
            if (currentNode.left == null) {
                currentNode.left = new Node(value);
            } else {
                _insert(currentNode.left, value);
            }
        } else if (value > currentNode.value) {
            if (currentNode.right == null) {
                currentNode.right = new Node(value);
            } else {
                _insert(currentNode.right, value);
            }
        }
    }
}