import java.util.Arrays;

/**
 * @author Nyami yannick (ngapmennyamiyannickloic@gmail.com)
 * @since 1.0 (03/01/22)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] A = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        bubleSort(A);
        System.out.println(Arrays.toString(A));
    }

    static int[] bubleSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        return A;
    }
}
