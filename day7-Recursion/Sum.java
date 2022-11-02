public class Sum {

    public static void PrintSumOFNamturalNUmber(int n, int i, int sum) {
        if (i > n ) {
            System.out.println(sum);
            return;
        }
        sum += i;
        i++;
        PrintSumOFNamturalNUmber(n, i, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int i = 0;
        PrintSumOFNamturalNUmber(n, i, sum);
    }
}
