public class getBit {
    public static void main(String[] args) {
        /// getting 3rd bit (position=2) of a Number n.=(0101)
        /*
         * bit mask 1<<i---- 1
         * Opertion : AND, OR,.....-------- 2
         * 
         * ex:
         * 
         */

        int n = 5;
        int pos = 2;

        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit was Zero");
        } else {
            System.out.println("bit was 1");
        }

    }
}
