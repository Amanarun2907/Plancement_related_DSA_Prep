//Type conversion in java 
import java.util.*;
public class Type_conversion {
    public static void main(String[] args) {
      int a =25;
      long b =a;
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter your int  number: ");
      float abc = sc.nextInt();
      System.out.println(" your float number: "+abc);
    // long a = 25; not possible to convert long to int so error is coming  
    // int b =a;

    //   System.out.println(b);  
    }
}
//type compatible
// destination type (long)>source type (int)
// lossy conversion : some data get lost 
// byte->short->int->float->long->double
// also known as Widening conversion or implicit conversion 
