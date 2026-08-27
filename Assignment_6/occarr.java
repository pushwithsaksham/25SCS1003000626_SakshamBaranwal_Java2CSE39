import java.util.Scanner;

public class occarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int found=0;
        System.out.print("Enter the element to count:");
        int key=sc.nextInt();
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (key==arr[i]) {
                found++;
            }
        }
        System.out.println("No. of occurance:" + found);
        sc.close();
    }
}
