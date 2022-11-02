public class CheckArraySorted {
    public static boolean checkSorted(int[] arr, int index) {

        if (arr.length - 1 == index) {
            return true;
        }
        if (arr[index] <= arr[index + 1]) {
            return checkSorted(arr, index + 1);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 4, 5 };
        int index = 0;
        boolean res = checkSorted(arr, index);
        System.out.println(res);
    }
}
