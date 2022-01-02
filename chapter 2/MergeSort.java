import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] A = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        mergeSort(A);
        System.out.println(Arrays.toString(A));
    }

    static int[] mergeSort(int[] A) {
        sort(A, 0, A.length - 1);
        return A;
    }

    static void sort(int[] A, int l, int r) {
        // break the array till peaces of size 1
        if (l < r) {
            // finding the middle of every subarray
            int m = l + (r - l) / 2;
            // sorting the first half
            sort(A, l, m);
            // sorting the second half
            sort(A, m + 1, r);
            // merging both
            merge(A, l, m, r);
        }
    }

    // first array A[l , m]
    // second array A[m+1 , r]
    static void merge(int[] A, int l, int m, int r) {
        // size of first array
        int s1 = m - l + 1;
        // size of second array
        int s2 = r - m;
        int[] L = new int[s1];
        int[] R = new int[s2];
        for (int i = 0; i < s1; i++)
            L[i] = A[l + i];
        for (int i = 0; i < s2; i++)
            R[i] = A[m + 1 + i];

        int i = 0, j = 0;
        int k = l;

        while (i < s1 && j < s2) {
            if (L[i] < R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < s1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < s2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

}
