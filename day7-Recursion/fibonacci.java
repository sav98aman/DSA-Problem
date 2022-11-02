public class fibonacci {

    public static void PrintFaboinacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        a = b;
        b = c;
        System.out.print(c + " ");
        PrintFaboinacci(a, b, n - 1);
    }

    public static void main(String[] args) {
        /*
         * fibonacci series--::: first twi term is =0 and 1
         * first term is 0 second term 1 3 rd term is 0+1=1; 4th term is 1+1=2 5th term
         * is 2+1=3
         */
        int n = 6;// print 6th term is of fibonacci series---
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        PrintFaboinacci(a, b, n);
    }
}
