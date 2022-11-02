public class UpdateBit {
    public static void main(String[] args) {
        // update the 2nd Bit (Position =1) a Number n to 1 (n=0101)

        // 1 made made
        int n = 5;// 0101 --- after update 0111;
        int pos = 1;
        int bitMask = 1 << pos;

        int Number = bitMask | n;
        System.out.println(Number);

        // update the 3rd Bit (Position =3) that means=0111----3rd bit set zero--0011;
        /*
         * n=5 ----0101;
         * 3rd bit make xero--0001
         */
        int newBitmask = 1 << 2;
        int newnewBitmask = ~(newBitmask);

        int newNumber = newnewBitmask & n;
        System.out.println(newNumber);

    }
}
