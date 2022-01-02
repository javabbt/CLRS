import java.util.Arrays;
import java.util.Collections;

/**
 * @author Nyami yannick (ngapmennyamiyannickloic@gmail.com)
 * @since 1.0 (02/01/22)
 */

// implementing the insertion sort algorithm
class InsertionSort {
    public static void main(String[] args) {
        int[] A = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        insertionSortAscending(A);
        System.out.println(Arrays.toString(A));

        int[] B = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        insertionSortDescending(B);
        System.out.println(Arrays.toString(B));

    }

    // method that implements the insertion sort in ascending order
    static int[] insertionSortAscending(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
        return A;
    }

    // method that implements Insertion sort in descending order
    static void insertionSortDescending(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] < key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }

}