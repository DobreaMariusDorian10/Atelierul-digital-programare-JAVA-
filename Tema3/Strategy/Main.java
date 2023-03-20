/*Stage 1- requirements: Given an interface SortingStrategy with the following method: void sort(Integer[ ] list);
Implement 2 sorting strategies BubleSort and MergeSort then use the following displaySorted method signature to apply them: void displaySorted(SortingStrategy strategy, Integer[] arr)
Sample output The following sample code should print 1 2 3 4 5 6 7 8 9 public static void raain(string[] args) Integer() arr = new Integer[]{1, 4, S, 2, 3, 6, 9, 8, 7); Integer[] copy010fArr = Arrays .copyOf (err, arr. length); Integer[] copy020fArr = Arrays.copyof(arr, arr.length),
display5orted(new BubleSort(), copy010fArr); display5orted(new Merge5ort(), copy020fArr); */
//Dobrea Marius-Dorian
import java.util.Arrays;
public  class Main extends BubleSort implements SortingStrategy{

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        if (strategy instanceof BubleSort) {
            BubleSort bubbleSort = new BubleSort();
            bubbleSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        if(strategy instanceof  MergeSort){
            MergeSort mergeSort=new MergeSort();
                    mergeSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        System.out.println(Arrays.toString(arr));
        Integer[] copy01OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr,arr.length);
        displaySorted(new BubleSort(),copy01OfArr);
        displaySorted(new MergeSort(),copy02OfArr);


    }

}