import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_functon_of_sort_of_an_array {

    public static void main(String[] args) {
      int arr[]= {3,2,5,9,1,11};
      Arrays.sort(arr,0,arr.length-1); // sorting in ascending order only ....
      for(int i = 0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }  
      System.out.println();
// sorting in decending order only ....
    Integer arr1[]= {4,22,1,5,6,3,0};
    Arrays.sort(arr1,0,arr1.length-1,Collections.reverseOrder());
    for(int i = 0;i<arr.length;i++)
    {
      System.out.print(arr1[i]+" ");
    }  
}
}
// comparators in java 
// if want to compare 2 numbers (a,b) such that if (a>b) it will return +ve , if (a==b) it will return 0 and if (b>a) then -ve so we have to make a function that will return a-b;