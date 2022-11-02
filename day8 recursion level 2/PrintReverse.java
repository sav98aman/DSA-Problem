public class PrintReverse {
    public static void PreversString(int indx, String s) {
        if (indx == 0) {
            System.out.print(s.charAt(indx));
            return;
        }
        System.out.print(s.charAt(indx));
        PreversString(indx - 1, s);

    }

    public static void main(String[] args) {
        String s = "abcd";
        int indx = s.length() - 1;
        PreversString(indx, s);
    }
}
