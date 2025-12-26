public class inverted_and_rotated_half_pyramid {
    public static void inverted_rotated_half_pyramid(int totrows,int totcols){
        for (int i = 1;i<=totrows;i++){
            // print spaces 
            for (int j = 1;j<=totcols-i;j++){
            System.out.print(" ");
            }
            // print stars ("*")
            for (int j = 1;j<=i;j++){
                System.out.print("*");
                }
        System.out.println();
        }

    }
    public static void main(String[] args) {
    //outer loop ---> rows 
    // inner loop ----> columns  
    // print spaces and star   
    // no of star in each spaces  = row number 
    // spaces in each row = total rows - row number 
    // first print space then row 
    inverted_rotated_half_pyramid(5,5);
}
}
//         star space  i    n=4
//     *     1    3    1
//    **     2    2    2   
//   ***     3    1    3
//  ****     4    0    4
// matrix must be square matrix ..........to note the pattern 