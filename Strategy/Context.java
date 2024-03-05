public class Context {
    int[] arr;
    private Sort sort;

    Context(int[] arr) {
        this.arr = arr;
    }

    void sortuj() {
        sort.sortArray(arr);
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
