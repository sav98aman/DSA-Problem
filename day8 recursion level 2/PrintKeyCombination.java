import javax.print.DocFlavor.STRING;

public class PrintKeyCombination {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void CombinationPrint(String str, int index, String combination) {

        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currcahr = str.charAt(index);
        String mapping = keypad[currcahr - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            CombinationPrint(str, index + 1, combination + mapping.charAt(i));

        }

    }

    public static void main(String[] args) {
        /**
         * 0-.;
         * 1-abc;
         * 2-def;
         * 3-ghi;
         * 4-jkl;
         * 5-mno;
         * 6-pqrs;
         * 7-tu;
         * 8-vwx;
         * 9-yz
         */
        String str = "23";
        String combination = "";
        int index = 0;
        CombinationPrint(str, index, combination);

    }
}
