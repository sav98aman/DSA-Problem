public class ClearBit {
    public static void main(String[] args) {

        // clear 3rd bit
        int n = 5;// --- 0101
        int pos = 2;// ----

        int bitMask = 1 << pos;// ---- 1st 0010 ---if second 0100;

        int notBitMask = ~(bitMask);

        int Number = notBitMask & n;
        System.out.println(Number);

    }
}
