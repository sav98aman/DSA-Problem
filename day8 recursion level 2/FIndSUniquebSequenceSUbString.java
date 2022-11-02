import java.util.HashSet;

public class FIndSUniquebSequenceSUbString {
    public static void SubsequencPRint(String s, String newSAString, int index, HashSet set) {

        if (s.length() == index) {
            if (set.contains(newSAString)) {
                return;
            } else {
                System.out.println(newSAString);
                set.add(newSAString);
                return;
            }
        }
        char currrChar = s.charAt(index);
        SubsequencPRint(s, newSAString + currrChar, index + 1, set);
        SubsequencPRint(s, newSAString, index + 1, set);

    }

    public static void main(String[] args) {
        String s = "aaa";
        int index = 0;
        String newString = "";
        HashSet<String> hasset = new HashSet<>();
        SubsequencPRint(s, newString, index, hasset);

        // 2**n time complexity==8 every node repersent two node
    }
}
