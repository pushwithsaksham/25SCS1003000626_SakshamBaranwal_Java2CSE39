import java.util.Scanner;

public class arrsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int found=-1;
        System.out.println("Enter the element to find:");
        int key=sc.nextInt();
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (key==arr[i]) {
                found=i;
            }
        }
        if (found>=0) {
            System.out.println("Found at " + (found+1));
        }
        else
            System.out.println("Not found");
        sc.close();
    }
}
