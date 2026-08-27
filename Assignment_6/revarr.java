import java.util.Scanner;

public class revarr {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of elements");
        for (int s = 0; s < n; s++) {
            arr[s] = sc.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i]=arr[(n-1)-i];
            arr[(n-1)-i]=temp;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + "  ");
        }
        sc.close();
    }
}
