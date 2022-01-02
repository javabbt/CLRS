import java.util.Arrays;

/**
 * @author Nyami yannick (ngapmennyamiyannickloic@gmail.com)
 * @since 1.0 (02/01/22)
 */

// implementing the insertion sort algorithm
class InsertionSort {
    public static void main(String[] args) {
        int[] A = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        insertionSort(A);
        System.out.println(Arrays.toString(A));

    }

    // method that implements the insertion sort
    static int[] insertionSort(int[] A) {
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
}