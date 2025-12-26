
public class solid_rhombus_pattern {
    // solid rhombus pattern
    public static void pattern(int n){
        for (int i = 1;i<=n;i++){// outer loop 
         //first you have to print  space 
         for(int j = 1;j<=n-i;j++){
        System.out.print(" ");
         } 
         // secondly you have to print "*"
        for (int j = 1;j<=n;j++){
            System.out.print("*");
         }
        System.out.println();  
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
//Solid rhombus 
//    *****
//   *****
//  *****
// *****
//***** 
