//inputs in java 
// import java.util.Scanner;
import java.util.*;
public class inputs_in_java {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : "); // aman jain 
    // String input=sc.next(); aman
    String input=sc.nextLine(); //aman jain
    System.out.println("Hello "+input);
    System.out.println("Enter your favourite number: ");
    int number = sc.nextInt();
    System.out.println("Your favourite number is: "+number);
    System.out.println("Enter your favourite float number: ");
    float num = sc.nextFloat();
    System.out.println("Your favourite float number is: "+num);
    System.out.println("are you sure about all the information you have provided is correct ? ");
    boolean abc = sc.nextBoolean();
    System.err.println(abc);
    int input1 = sc.nextInt();
    input1 = sc.nextInt();
    System.out.println(input1);
    }
    
}
// next 
// nextLine
//nextInt
//nextFloat
//nextDouble
//nextBollean
//nextShort
//nextLong
//Stackoverflow website 