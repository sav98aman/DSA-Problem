import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class RemoveDuplicateIn {
    public static boolean[] map = new boolean[26];

    public static void RemoveDuplicate(String s, int index, String newString) {
        if (index == s.length()) {
            System.out.println(newString);
            return;
        }

        char currcahr = s.charAt(index);
        if (map[currcahr - 'a'] == true) {
            RemoveDuplicate(s, index + 1, newString);
        } else {
            newString += currcahr;
            map[currcahr - 'a'] = true;
            RemoveDuplicate(s, index, newString);
        }
    }

    public static void main(String[] args) {
        String s = "abbccda";
        int index = 0;
        String newString = "";
        RemoveDuplicate(s, index, newString);
        // System.out.println(Arrays.toString(map));

    }
}
