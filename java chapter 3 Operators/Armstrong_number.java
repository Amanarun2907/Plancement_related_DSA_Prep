import java.util.*;
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc . nextInt();
        int N =n; // creating a copy
        int sum_of_digit=0;
        while(n!=0){
             int x = n%10; // modulo operator for finding digit
             n = n/10; // divide operator is used
            sum_of_digit = ((x)*(x)*(x))+sum_of_digit;
        }
        if(sum_of_digit==N){
            System.out.println(" yes it is a Armstrong Number");
        }
        else{
            System.out.println("No it is not a armstrong number");
        }

    }
}
