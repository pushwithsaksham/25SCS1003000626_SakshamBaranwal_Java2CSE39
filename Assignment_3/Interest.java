import java.util.*;
public class Interest{
    public static void main(String[] args){Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount:");
        int amount = sc.nextInt();
        System.out.print("Enter Rate of Interest:");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (Years):");
        int time = sc.nextInt();
        double interest = (amount*rate*time)/100;
        System.out.println("Interest:"+ interest);
        sc.close();
    }
}