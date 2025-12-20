import java.util.*;
public class multiplication_of_two_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a ");
        int a = sc.nextInt();
        System.out.println("the value of a is "+a);
        System.out.println("Enter the first number b ");
        int b = sc.nextInt();
        System.out.println("the value of b is "+b);
        int multiplication = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is: " + multiplication);
    }
}
