public class NumberPrint5 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print(0 + " ");
                    } else {
                        System.out.print(1 + " ");
                    }
                } else {
                    if (j % 2 == 1) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
            }
            System.out.println();
        }
        // 2nd way
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}
