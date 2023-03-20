public class ArrayCustomIterator {
    private int[] arr;
    private int i = 0;

    public ArrayCustomIterator(int[] arr) {
    this.arr=arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }
    }

    private boolean hasNext() {
        return arr.length > i;
    }
    private int next() {
        return arr[i++];
    }
}