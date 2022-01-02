public class BinarySearch {
    public static void main(String[] args) {
        int[] A = { 13, 4, 5, 0, 7, 9 };
        int result = binarySearch(A, 0, A.length - 1, 9);
        System.out.println(result);
    }

    static int binarySearch(int[] A, int l, int r, int x) {
        if (l <= r) {
            int middle = l + (r - l) / 2;
            if (A[middle] == x)
                return middle;

            if (A[middle] > x)
                binarySearch(A, l, middle - 1, x);

            return binarySearch(A, middle + 1, r, x);
        }
        return -1;
    }
}
