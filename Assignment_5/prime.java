import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                isPrime = false;
            }
        }
        if (isPrime) {
        System.out.println("it is Prime");
        }
        else
            System.out.println("Not a prime");
        sc.close();
    }
}
