public class PrintSubSequence {
    public static int count = 0;

    public static void SubsequencPRint(String s, String newSAString, int index) {

        if (s.length() == index) {
            count++;
            System.out.println(newSAString);
            return;
        }
        char currChar = s.charAt(index);
        SubsequencPRint(s, newSAString + currChar, index + 1);
        SubsequencPRint(s, newSAString, index + 1);

    }

    public static void main(String[] args) {
        String s = "aaa";
        int index = 0;
        String newString = "";

        SubsequencPRint(s, newString, index);
        System.out.println(count);
        // 2**n time complexity==8 every node repersent two node
    }
}
