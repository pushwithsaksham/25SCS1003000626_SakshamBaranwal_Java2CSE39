import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a = sc.nextInt();
        System.out.print("Enter second Number:");
        int b = sc.nextInt();
        int Sum = a+b;
        System.out.println("Sum = "+Sum);
        sc.close();
    }
}

