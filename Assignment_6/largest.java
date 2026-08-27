import java.util.*;
public class largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int largest=0;
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (largest<arr[i]) {
                largest=arr[i];
            }
        }
        System.out.println("Largest:"+ largest);
        sc.close();
    }
}
