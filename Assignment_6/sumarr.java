import java.util.*;
public class sumarr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
