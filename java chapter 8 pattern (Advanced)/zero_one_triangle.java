public class zero_one_triangle {
    public static void pattern(int n){
        for (int i =1;i<=n;i++){
            // square matrix is the matrix where no of rows is equal to no of columns 
        for (int j = 1;j<=i;j++){
            if((i+j)%2==0){ // beautiful logic with clear use of position of element in matrix 
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
// 1                  (1,1,even,1)
// 0 1                (2,1,odd,0) (2,2,even,1)
// 1 0 1              (3,1,even,1) (3,2,odd,0) (3,3,even,1)
// 0 1 0 1            (4,1,odd,0) (4,2,even,1) (4,3,odd,0) (4,4,even,1)
// 1 0 1 0 1          (5,1,even,1) (5,2,odd,0) (5,3,even,1) (5,4,odd,0)  (5,5,even,1)
// identify the no of rows 
// identify the number of columns 
// make logic using matrix , element position in matrix ,rows and columns of matrix 