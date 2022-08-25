import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2Variable {
    public static void main(String[] args) throws IOException {
        int a = 10, b = 5;
        System.out.println((a * b) / (a - b));

        System.out.println(
                "Loop condition \nplease Enter \n 1- for If else \n 2- for nasted if else \n 3 - for DO-while \n 4- do while \n 5 for while \n 6 -for  FOR loop");

        BufferedReader ibr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter input");
        String s = ibr.readLine();
        // System.out.println(s);
        int key = Integer.parseInt(s);
        switch (key) {
            case 1:
                System.out.println("if else ");
                System.out.println(" check number odd or even\nenter input");
                int num = Integer.parseInt(ibr.readLine());
                if (num % 2 == 0) {
                    System.out.println(num + " is even Number ");
                } else {
                    System.out.println(num + " is odd Number ");
                }

                break;
            case 2:
                System.out.println("nasted if else");
                System.out.println(" check you are eligiable to  for Driving or not \n please enter age or ");
                int age = Integer.parseInt(ibr.readLine());
                System.out.println("have a driving licinance or not please enter true or false2");
                boolean tf = Boolean.parseBoolean(ibr.readLine());
                if (age >= 18) {
                    if (tf) {
                        System.out.println(age + " you are eligiable for driving ");
                    } else {
                        System.out.println(" you are not eligiable for driving  beacuse not having a lic..");
                    }
                } else {
                    System.out.println(age + " you are not eligiable for driving  beacuse u are under age");
                }

                break;
            case 3:
                System.out.println("do while loop");
                System.out.println("\n printing the odd number in between 1 to number");
                System.out.println("please Enter Number");
                int number=Integer.parseInt(ibr.readLine());
                int i=1;
                do {
                    System.out.print(i+" ");
                    i++;
                } while (i<=number);


                break;
            case 4:
                System.out.println( "while loop");
                System.out.println("findind th factorial of number");
                System.out.println("please Enter Input");
              
                int fac=Integer.parseInt(ibr.readLine());
                int res=1;
                while(fac>=1){
                    res=res*fac;
                    fac--;
                }
                System.out.println("factorial is:4 "+res);
                break;
            case 5:
                System.out.println("While loop");
                break;
            case 6:
                System.out.println("for loop");

            default:
                break;

        }

    }
}
