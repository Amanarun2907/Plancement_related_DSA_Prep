import java.util.*;
public class bitwise_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        System.out.println("Enter the second number");
        int m = sc.nextInt();
        System.out.println("The bitwise and of these two number which you have entered is: "+(n&m));
        System.out.println("The bitwise or of these two number which you have entered is: "+(n|m));
        System.out.println("The bitwise xor of these two number which you have entered is: "+(n^m));
        // System.out.println("the bitwise and of 3 and 5 is: "+(3 & 5)); // bitwise and
        // 3   0011
        //5    0101
        //And  0001----->1 in decimal 
        // System.out.println("the bitwise or of 4 and 8 is: "+(4 | 8)); // bitwise or
        //4   0100
        //8   1000
        //or  1100------>12
        // System.out.println("the bitwise xor of 6 and 8 is: "+(6 ^ 8)); // bitwise Xor
        //6   0110
        //8   1000
        //xor 1110------>14

        // Thanks 
    }
}
//Bitwise operator 
// bitwise and 
// bitwise or 
// bitwise Xor