import java.util.*;
public class Email {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        String Name = sc.nextLine();
        System.out.print("Enter Email:");
        String Email = sc.nextLine();
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name : "+ Name);
        System.out.println("Email : "+ Email);
        sc.close();
    }
}
