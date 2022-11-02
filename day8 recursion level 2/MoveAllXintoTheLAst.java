public class MoveAllXintoTheLAst {

    public static void checkXinString(String s, char aplha, int count, int index, String newString) {
        if (index == s.length()) {
            for (int i = 0; i < count; i++) {
                newString += aplha;
            }
            System.out.println(newString);
            return;
        }

        if (s.charAt(index) == aplha) {
            count++;
            checkXinString(s, aplha, count, index + 1, newString);
        } else {
            newString += s.charAt(index);
            checkXinString(s, aplha, count, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String s = "axbxcxxd";
        int count = 0;
        int index = 0;
        String newStr = "";

        checkXinString(s, 'x', count, index, newStr);

    }
}
