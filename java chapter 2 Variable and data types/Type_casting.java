//Type casting in java
public class Type_casting {
    public static void main(String[] args) {
       float a = 25.9999f; // Round off is not possible
    // int b = a; lossy conversion
    int b = (int)a; // TYPE CASTING
   char ch = 'a';
   char ch2 = 'b';
   int number = ch;
   int number2 = ch2;
   System.out.println(number); 
   System.out.println(number2); 
   System.out.println(a);
   System.out.println(b);

    }
}
// Type casting is also known as narrow conversion 
// Also known as explicit conversion 
