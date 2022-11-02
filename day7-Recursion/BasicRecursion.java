public class BasicRecursion {

    public static void PrintNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");

        PrintNumber(n - 1);

    }

    public static void PrintNumber_2(int n) {
        if (n == 6) {
            return;
        }

        System.out.println(n);
        n++;
        PrintNumber_2(n);
    }

    public static void main(String[] args) {
        /*
         * Recursion call it self funnction-
         * f(f(f(f(f(f(f(f(f(f(f.....................Recursion.........Method
         * .........))))))))))
         * outer function and inner function
         * 
         * **************main********** call It self -----------calling agin and again
         * when recahed the
         */

        // Print NUmber From 5 to 1 by recursive
        int n = 5;
        PrintNumber(n);
        System.out.println();
        n = 1;
        PrintNumber_2(n);
    }

}
