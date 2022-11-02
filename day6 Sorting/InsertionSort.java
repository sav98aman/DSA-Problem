public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        int n = arr.length;

        // insertion part ---
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
