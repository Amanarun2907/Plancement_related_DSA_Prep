import java.util.*;
public class odd_even_logic {
    public static void main(String[] args) {
        // case 1 of even odd logic 
        Scanner sc = new Scanner (System.in);
        // System.out.println("Enter the number you want to check wheather it is even or odd ");
        // int num = sc.nextInt();
        // if(num%2==0){
        // System.out.println(" Even number ! ");
        // }
        // else{
        //     System.out.println(" Odd number ! ");
        // }
        // case 2 -----------
    //     System.out.println("Enter the number upto to which you have to even number (Range starts from 1)");
    //   int num = sc.nextInt();
    //   for (int i = 1;i<=num;i++){
    //     if (i%2==0){
    //         System.out.println(i);
    //     }
    //   }
//    case 3-----------
System.out.println("Enter the number upto to which you have to odd number (Range starts from 1)");
int num = sc.nextInt();
for (int i = 1;i<=num;i++){
  if (i%2!=0){
      System.out.println(i);
  }
}
sc.close();
    }
}
