public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(5);
        int[] arr = new int[]{1, 2, 6, 8};
        binaryTree.insert(arr);
        Iterator iterator = new Iterator(binaryTree);
        System.out.println(iterator.first().value);
        while (true)
            for (int i = 0; i < 3; i++) {
                System.out.println(iterator.next().value);
            }
    }
}
