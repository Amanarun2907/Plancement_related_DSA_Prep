public class floyd_triangle {
    public static void pattern(int n){
       int counter =1;
       for (int i = 1;i<=n;i++){
        for (int j =1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
       } 
    }
    public static void main(String[] args) {
       pattern(5); 
    }
}
//   1               i = (1) , j = (1) ,         counter = (1) 
//   2  3            i = (2) , j = (1,2),        counter = (2,3)
//   4  5  6         i = (3) , j = (1,2,3),      counter = (4,5,6)
//   7  8  9  10     i = (4) , j = (1,2,3,4),    counter=  (7,8,9,10)
//   11 12 13 14 15  i = (5) , j = (1,2,3,4,5),  counter=  (11,12,13,14,15)