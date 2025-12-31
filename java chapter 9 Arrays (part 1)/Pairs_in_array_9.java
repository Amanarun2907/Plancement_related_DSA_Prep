
public class Pairs_in_array_9{
    public static void pairs(int arr[] ){
        int counter = 0; // it actually count the no of pairs in an array 
        for (int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("total pair formed are: "+counter);
        // total pairs in an array 
    } 
    public static void main(String[] args) {
      int arr[] = {2,4,6,8,10};
      pairs(arr);

    }
}
// pairs  in an array 
// int arr[] ={2,4,6,8,10}
// pair of 2 = (2,4) (2,6) (2,8) (2,10)
// pair of 4 = (4,6) (4,8) (4,10)
// pair of 6 = (6,8) (6,10)
// pair of 8 = (8,10)
// in this question (a,b)=(b,a)
// nested loop 
// if elements are n then total pair are [n*(n+1)/2] (Important formulla)

// output : 
//(2,4) (2,6) (2,8) (2,10) 
// (4,6) (4,8) (4,10) 
// (6,8) (6,10) 
// (8,10)



//Time complexity is : O(n^2)


