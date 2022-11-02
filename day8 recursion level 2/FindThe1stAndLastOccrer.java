public class FindThe1stAndLastOccrer {
    public static int Findex = -1;
    public static int LasIndex = -1;

    public static void OccuranceFirstorLast(int index, String s, char alpha) {
        if (index == s.length()) {
            System.out.println(Findex + " " + LasIndex);
            return;
        }
        if (s.charAt(index) == alpha) {
            if (Findex == -1) {
                Findex = index;
            } else {
                LasIndex = index;
            }
        }
        OccuranceFirstorLast(index + 1, s, alpha);
    }

    public static void main(String[] args) {
        String s = "abaacdaefaah";
        int index = 0;
        OccuranceFirstorLast(index, s, 'a');

    }
}
