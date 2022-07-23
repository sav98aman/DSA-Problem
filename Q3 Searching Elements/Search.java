import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Search {
    // ist approched
    public static boolean searching(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return true;
            }
        }
        return false;
    }

    // 2nd Approched
    public static boolean binarys(int n, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        // 1st sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 2nd finding Element
        while (left < right) {
            int mid = Math.abs((left + right) / 2);
            if (arr[mid] == n) {
                return true;
            } else if (arr[mid] > n) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Number Which one wants to search");
        int s = scanner.nextInt();
        // int[] arr=new int[5];
        int[] arr = { 1, 2, 56, 89, 7, 9 };
        // finding elements 56 which Postion In array

        Boolean Inbinary_serach = binarys(s, arr);
        System.out.println(Inbinary_serach);

        boolean IsPersent = searching(s, arr);
        if (IsPersent)
            System.out.println(s + "  Is persent in List");
        else
            System.out.println(s + "Is Not persent in List");
    }

}
