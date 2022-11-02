public class TowerOFHanoi {

    public static void towerhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer Disk " + n + " From " + src + " to " + dest);
            return;
        }
        towerhanoi(n - 1, src, dest, helper);
        System.out.println("transfer Disk " + n + " From " + src + " to " + dest);
        towerhanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {

        int n = 3;
        towerhanoi(n, "s", "h", "d");

    }
}
