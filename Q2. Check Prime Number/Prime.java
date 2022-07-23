public class Prime {
// 1 check prime for single number
    public static void checkprime(int n) {
        int pcount=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                pcount++;
        }
        if(pcount==2){
            System.out.println("Prime number");
        }else{
            System.out.println(n+":Not Prime Number");
        }
    }
//  2   print Prime number in between 1 to n;
public static void printPrimeNumber(int n) {
    
    for(int i=1;i<=n;i++){
        int pcount=0;
        for(int j=1;j<=i;j++){
            if(i%j==0)
                pcount++;
        }
        System.err.println("***************************************");
        if(pcount==2){
            System.out.println(i+": IsPrime Number");
        }else{
            System.out.println(i+":Not Prime Number");
        }
        System.err.println("***************************************");

    }
}

    public static void main(String[] args) {
        
        int n=10;
        checkprime(n);
        printPrimeNumber(n);
    }
}
