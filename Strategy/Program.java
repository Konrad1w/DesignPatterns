public class Program {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 8, 1, 23, 1, 2};
        Context context = new Context(array);
        context.setSort(new SortBubbleSort());
        context.sortuj();
        context.printArr();

    }
}
