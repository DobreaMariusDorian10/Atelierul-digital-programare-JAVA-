import java.util.*;

public class Main {
    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

           // the program encountered a continue statement,
            // which makes the control to jump at the beginning of the for loop for next iteration,
            // skipping the statements for current iteration
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
    public static void main(String[] args) {
        int contor=1;
        int[] a = { 1, -1, 2, -2, 2, -2, 4, -2,-3,-3,3,3,3,3,-3};
        for (int i = 0; i < a.length - 1; i++) {
            for (int k = 1; k < a.length - 1; k++) {
                if (a[i] +a[k]==0) {
                    a = removeTheElement(a,i);
                    a = removeTheElement(a,k-1);
                    contor++;
                }
            }
        }
        System.out.println("Numarul total de perechi este:"+contor);
        }
    }
