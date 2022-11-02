public class PrintXpowerNthheifgt {
    public static int PRintPower(int x, int n) {
        int res = 1;
        if (n == 0) {

            return res;
        }
        if (x == 0) {
            res = 0;
        }
        int xp = PRintPower(x, n - 1);
        res = x * xp;
        return res;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int res = PRintPower(x, n);
        System.out.println(res);
    }
}
