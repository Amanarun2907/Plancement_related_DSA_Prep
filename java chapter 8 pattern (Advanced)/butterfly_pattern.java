public class butterfly_pattern {
    // very very important question and it is favourite question ..........
    public static void pattern(int n){
        // 1st half of question 
        for (int i = 1;i<=n;i++){ // outer loop 
            // print star equal to i
            for (int j = 1;j<=i;j++){ 
                System.out.print("*");
            }
            // print spaces  equal to 2*(n-i)
            for (int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            } 
            // again print star  equal to i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println(); // next line 
        }
        // 2nd  half of question 
        for(int i = n;i>=1;i--){
                        // print star equal to i
                        for (int j = 1;j<=i;j++){
                            System.out.print("*");
                        }
                        // print spaces equal to 2*(n-i)
                        for (int j = 1;j<=2*(n-i);j++){
                            System.out.print(" ");
                        } 
                        // again print star equal to i 
                        for(int j = 1;j<=i;j++){
                            System.out.print("*");
                        }
                    System.out.println();

        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
// BUTTERFLY PATTERN (VERY VERY IMPORTANT)
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *