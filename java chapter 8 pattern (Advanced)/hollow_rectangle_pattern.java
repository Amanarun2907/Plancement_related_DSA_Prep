// hollow rectangle pattern question .....................
import java.util.Scanner;
public class hollow_rectangle_pattern{
    public static void hollow_rectangle(int totRows , int totCols){ // return type void 
        for (int i = 1;i<=totRows;i++){ // outer loop for rows of matrix 
            for (int j = 1;j<=totCols;j++){ // inner loop for columns of matrix
                // Cell number (i,j)
                if(i==1 ||i==totRows||j==1||j==totCols){       // where to print "*"
                  
                System.out.print("*"); // print star 
                }
                else{
                    System.out.print(" "); //  print space 
                }

                }
                System.out.println(); // nextline  after completion of inner loop 
            }
          }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int a = sc.nextInt(); // i/p 01
        System.out.println("enter the no of columns");
        int b = sc.nextInt(); // i/p 02
   // matrix is in form of rows and columns always 
   // star pattern is solved by matrix approach 
   // size of matrix : no of rows * no of columns 
   // element number = (row number,column no ) 
   // logic 
   // total rows : 1 to 4 (outer loop )
   // first and last row and first and last column are completely filled 
   hollow_rectangle(a,b); // function calling to create hollow rectangle pattern 
    }
}
// ***** (1,1*) (1,2*) (1,3*) (1,4*) (1,5*)    i = 1 , j = 1,2,3,4,5
// *   *  (2,1*) (2,2) (2,3) (2,4) (2,5*)      i = 2 , j = 1,2,3,4,5
// *   *  (3,1*)  (3,2) (3,3) (3,4) (3,5*)     i = 3 , j = 1,2,3,4,5
// *****  (4,1*)  (4,2*)  (4,3*) (4,4*) (4,5*) i = 4 , j = 1,2,3,4,5
