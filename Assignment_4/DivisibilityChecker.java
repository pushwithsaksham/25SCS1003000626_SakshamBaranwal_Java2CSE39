import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("Divisible by 5");

            if (n % 10 == 0)
                System.out.println("Also divisible by 10");
            else
                System.out.println("Not divisible by 10");

        } else {
            System.out.println("Not divisible by 5");
        }
    }
}
