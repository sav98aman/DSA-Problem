public class NUmberPrint3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print((i + j + 1) + " ");
            }
            System.out.println();
        }
    }
}
