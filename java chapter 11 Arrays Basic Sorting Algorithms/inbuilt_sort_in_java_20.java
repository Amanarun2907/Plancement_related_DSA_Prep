import java.util.Arrays; // import this package 
public class inbuilt_sort_in_java_20 {
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
       public static void printarr1(Integer arr[]){
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
    public static void main(String[] args) {
        Integer arr[]={6,4,8,6,9,0,3,2,1};
        int arr1[]={6,4,8,6,9,0,3,2,1};
        // Arrays.sort(arr1);
        // printarr(arr1);   // 0 1 2 3 4 6 6 8 9


        Arrays.sort(arr1,2,6); // sorting only perform from index = 2 to index = 6 
        printarr(arr1);  // 6 4 0 6 8 9 3 2 1


        // Arrays.sort(arr,2,6,Collections.reverseOrder());
        // printarr1(arr); // o/p 6 4 9 8 6 0 3 2 1



        // Arrays.sort(arr,Collections.reverseOrder());
        // printarr1(arr);  // 9 8 6 6 4 3 2 1 0
    }
    // comparators in inbuilt function 

}
