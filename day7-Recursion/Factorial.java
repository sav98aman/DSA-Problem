public class Factorial {
    public static int FactorialCal(int n) {
        if (n == 1 || n == 0) {
            return 1;
            
        }
        int fact=FactorialCal(n - 1);
        int fac = n * fact;
        return fac;
    }

    public static void main(String[] args) {
        int n = 5;
        int fac = FactorialCal(n);
        System.out.println(fac);
    }
}
