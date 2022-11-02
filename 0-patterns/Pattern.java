public class Pattern {
    public static void ButerFlyPatterns(int n) {
        /*
            *      *
            **    **
            ***  ***
            ********
            ********
            ***  ***
            **    **
            *      *
         */
        // System.out.println(n);
        for(int i=0;i<n;i++){
            for (int j=0;j<i; j++) {
                System.out.print("*");
            }
            for (int j=0;j<2*(n - i)-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i; j++) {
                System.out.print("*");
            }
            for (int j=0;j<i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    public static void PrintOneZeroPattern(int n) {
        /*
        1
        01
        101
        0101
        10101
        */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void PrintPatternIncreaseNumber(int n) {
        /*
            1
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
         */
        int k=1;
        System.out.print(k);
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
    public static void PrintNumberPattern(int n) {
    /*
        12345
        1234
        123
        12
        1
     */
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print((j+1));
        }
        for(int j=n-i-1;j<n;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
   }
    public static void PrintRightAngaleTriagle(int n) {
         /*
         *
        **
       ***
      ****
     */
        for(int i=0;i<n;i++){
           for(int j=0;j<n-1-i;j++){
            System.out.print(" ");
           }
           for(int j=n-1-i;j<n;j++){
            System.out.print("*");
           }
            System.out.println();
        }
      
    }
    public static void HallowStarPrint(int n) {
        /*
            *****
            *   *
            *   *
            *****
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1 || i==n-1 || j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Pattern.HallowStarPrint(5);
        // Pattern.PrintRightAngaleTriagle(4);
        // Pattern.PrintNumberPattern(6);
        // Pattern.PrintPatternIncreaseNumber(5);
        // Pattern.PrintOneZeroPattern(5);
        Pattern.ButerFlyPatterns(6);

    }
}
