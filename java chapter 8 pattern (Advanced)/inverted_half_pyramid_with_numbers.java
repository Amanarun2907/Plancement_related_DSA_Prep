public class inverted_half_pyramid_with_numbers {
    public static void pattern(int n ) {
        for (int i = 1;i<=n;i++){
         for (int j = 1;j<=n-i+1;j++){
            System.out.print(j+(" "));
         }
        System.out.println();
        }
        // you have to carefully see the pattern in form of matrix to see the logic and understanding the pattern 
        // i = 1   j = 1,2,3,4,5      12345
        // i = 2   j = 1,2,3,4        1234
        // i = 3   j = 1,2,3          123 
        // i = 4   j = 1,2            12
        // i = 5   j = 1              1
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
