//Comments in java
import java.util.Scanner;
public class comments_in_java {
public static void main(String[] args) {
   //Comments are the part of code which it not going to executed , no erro and no fault
    // Hello to all
    // Myself Aman jain 
    // From BML MUNJAL UNIVERSITY
    // Student of Appna College


// is_palindorme_problem 
Scanner sc = new Scanner(System.in);
System.out.println("enter the number ");
int number = sc.nextInt();
System.out.println("the number is: "+number);
if(ispalindorme(number)){
    System.out.println("the number is palindorme in nature");
}
else{
    System.out.println("the number is not palindrome in nature");
}


}
 public static boolean ispalindorme(int  number) {
     int original_number = number;
     int reverse_number=0;
     while(number>0){
        int digit=number%10;
        reverse_number=(reverse_number*10)+digit;
        number=number/10;
     }
     return original_number==reverse_number;
     }
 }
