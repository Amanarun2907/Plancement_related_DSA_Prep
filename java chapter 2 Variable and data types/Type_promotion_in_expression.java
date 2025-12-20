//Type promotion in expression 
public class Type_promotion_in_expression {
public static void main(String[] args) {
    //  char a='a';
    //  char b='b';
    //  System.out.println((int)a);
    //  System.out.println((int)b);
    //  System.out.println(a);
    //  System.out.println(b);
    //  System.out.println(b-a);
    // short  c = 5;
    // byte d =25;
    // char e = 'e';
    // int f = c+d+e;
    // System.out.println(f);
    // byte f = (byte)(c+d+e);
    // System.out.println(f);
    int a =10;
    float b =20.25f;
    long c =25;
    double d =30;
    double ans=a+b+c+d;
    // System.out.println("Answer = "+ans);
    byte xyz=3;
    byte abc = (byte)(xyz*2);
    int def=xyz*2;
    System.out.println(abc);
    System.out.println(def);
      
    }
}
//Byte , short and char will convert into int 
//type  casting and type promotion in expression 
//if one operand is long,float or double then the whole expression is promoted to long , float or double respectively depending on the largest data type.
 