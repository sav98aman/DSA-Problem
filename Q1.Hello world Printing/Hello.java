import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the text in.... ex Hello world ");
            String s1 = sc.nextLine();
            System.out.println("Welcome to your out-put Screen");
            System.out.println("Your Input: " + s1);
        }

    }
}
