//product of two number taking input from user 
import java.util.*;
public class product_of_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        int product=a*b;
        System.out.println("The product of two number is : "+product);
    }
}
