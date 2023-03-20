public class MergeSort  implements SortingStrategy {
    public void sort(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(Integer[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(Integer[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];//sir stanga
        int[] R = new int[n2];//sir dreapta

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];//introduce in sirul L elementele din sirul intial atat timp cat dim e mai mica
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];//introduce in sirul D de elemente din sirul initial atat timp cat dim e mai mica
        }

        int i = 0, j = 0, k = l; // contor stanga dreapta control sir intial
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];// aici se sorteaza efectiv
                i++;
            } else {
                arr[k] = R[j]; // aici se sorteaza efectiv
                j++;
            }
            k++; // se contorizeaza pt ca elementul mai mare si adauga direct in sirul merged
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }// bagam restu de elemente din in sirul merged din sirul din stanga

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        } // bagam restul de elemente din sirul merge din sirul din dreapta
    }
}
