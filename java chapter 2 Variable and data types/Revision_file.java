// type conversion , type casting , type promotion in expression
public class Revision_file{
    public static void main (String args[]){
    // Type conversion (Implicit Nature )
    int a  = 10;
    float b = a; 
    System.out.println("the value of b is "+b); // 10.0
    // Type casting  (Explicit Nature )
    float c = 12.5f;
    int d  = (int) c;
    System.out.println("the value of d is "+d); // 12 (loss of information)
    // Type promotion in expression 
    short x = 10;
    char aman ='r'; // single string 
    byte y = 20;
    int z = x+aman+y; // rule : short , byte , char --> int
    System.out.println("the value of z is "+z); //144
    int arun = 10;
    float brij = 12.5f;
    double chintu = 15.5;
    double result = arun + brij + chintu; // int , float --> double  
    int result1 = (int) (arun + brij + chintu); // 38
    System.out.println("the value of result is "+result); // (38.0)
    System.out.println("the value of result1 is "+result1); // // 38
    }
}