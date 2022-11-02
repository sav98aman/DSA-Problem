public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { 7, 8, 3, 1, 2 };
        // System.out.println(arr[0]);
        int n = arr.length;

        // buuble BubbleSort----- time complexity is --O(n2)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
